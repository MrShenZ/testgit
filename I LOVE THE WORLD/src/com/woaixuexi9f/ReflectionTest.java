package com.woaixuexi9f;

public class ReflectionTest {
	public static void main(String args[])throws Exception{
		ReflectionTest rec=new ReflectionTest();
		System.out.println(rec.getClass().getName());
		Class<?> class1=null;
		Class<?> class2=null;
		Class<?> class3=null;
		class1=Class.forName("com.woaixuexi9f.ReflectionTest");
		class2=new ReflectionTest().getClass();
		class3=ReflectionTest.class;
		System.out.println("������"+class1.getName());
		System.out.println("������"+class2.getName());
		System.out.println("������"+class3.getName());
	}
}
