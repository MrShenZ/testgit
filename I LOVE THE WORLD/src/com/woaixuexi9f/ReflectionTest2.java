package com.woaixuexi9f;

import java.lang.reflect.Constructor;

public class ReflectionTest2 {
	public static void main(String args[]) throws Exception{
		Class<?> class1=new User().getClass();
		User user=(User)class1.newInstance();
		user.setAge(20);
		user.setName("实例化对象");
		System.out.println(user);
		
		Constructor<?> con[]=class1.getConstructors();
		for(int i=0;i<con.length;i++){
			Class<?> clazzs[]=con[i].getParameterTypes();
			System.out.print("cons["+i+"](");
			for(int j=0;j<clazzs.length;j++){
				if(j==clazzs.length-1)
					System.out.print(clazzs[j].getName());
				else
					System.out.print(clazzs[j].getName()+",");
			}
			System.out.println(")");
		}
		user=(User)con[1].newInstance("遍历构造函数！");
		System.out.println(user);
		user=(User)con[0].newInstance(20,"遍历参数！");
		System.out.println(user);
	}
}
class User {
	private int age;
	private String name;
	public User(){}
	public User(String name){
		this.name=name;
	}
	public User(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String toString(){
		return "User[age="+age+",name="+name+"]";
	}
}