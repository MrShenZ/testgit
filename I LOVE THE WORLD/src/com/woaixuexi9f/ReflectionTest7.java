package com.woaixuexi9f;

import java.lang.reflect.Method;

public class ReflectionTest7 {
	public static void  main(String args[])throws Exception{
		Class<?> clazz=new ReflectionTest7().getClass();
		Method method=clazz.getMethod("reflect",int.class,String.class);
		method.invoke(clazz.newInstance(),20,"沈哲");
		method=clazz.getMethod("reflect");
		method.invoke(clazz.newInstance());
	}
	public void reflect(){
		System.out.println("反射调用无参方法");
	}
	public void reflect(int age,String name){
		System.out.println("反射调用有参方法");
		System.out.println("age"+age+"name"+name);
	}
}

