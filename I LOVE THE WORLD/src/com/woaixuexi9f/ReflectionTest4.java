package com.woaixuexi9f;

import java.lang.reflect.Field;

public class ReflectionTest4 {
	private String proprety=null;
	public static void main(String args[])throws Exception{
		Class<?> clazz=new ReflectionTest4().getClass();
		Object object=clazz.newInstance();
		Field field=clazz.getDeclaredField("proprety");
		field.setAccessible(true);
		field.set(object, "java·´Éä»úÖÆ");
		System.out.println(field.get(object));
	}
	public String getPro(){
		return proprety;
	}
}
