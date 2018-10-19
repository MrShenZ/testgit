package com.woaixuexi9f;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionTest3 implements Serializable {
	private static final long serialVersionUID=-1l;
	public int value=0;
	public static void main(String args[]){
		Class<?> class2=new ReflectionTest3().getClass();
		System.out.println("类的所有属性:");
		Field field[]=class2.getDeclaredFields();
		for(int i=0;i<field.length;i++){
			int mo=field[i].getModifiers();
			String xsf=Modifier.toString(mo);
			Class<?> type=field[i].getType();
			System.out.println(xsf+" "+type.getName()+" "+field[i].getName()+";");
		}
		System.out.println("类的公开属性:");
		Field field2[]=class2.getFields();
		for(int i=0;i<field2.length;i++){
			int mo=field2[i].getModifiers();
			String xsf=Modifier.toString(mo);
			Class<?> type=field2[i].getType();
			System.out.println(xsf+" "+type.getName()+" "+field2[i].getName()+";");
		}
	}
}
