package com.woaixuexi9f;
import java.io.Serializable;

public class ReflectionTest1 implements Serializable{
	private static final long serialVersionUID=-1L;
	public static void main(String args[]) throws  Exception{
		Class<?> clazz=new ReflectionTest1().getClass();
		Class<?> parentClass=clazz.getSuperclass();
		System.out.println("父类为："+parentClass.getName());
		Class<?> intes[]=clazz.getInterfaces();
		System.out.println("实现的接口有：");
		for(int i=0;i<intes.length;i++){
			System.out.println((i+1)+intes[i].getName());
		}
	}
}
