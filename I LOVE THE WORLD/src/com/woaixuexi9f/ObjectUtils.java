package com.woaixuexi9f;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectUtils {
	/**
     * 将source的属性拷贝到target中
     * @param source
     * @param target
     */
    public static void copyProperties(Object source, Object target){
        Class<?> sou=source.getClass();
        Field field[]=sou.getDeclaredFields();
        for(int i=0;i<field.length;++i){
        	field[i].setAccessible(true);
        	try{
        		Method method=sou.getMethod("set"+capitalize(field[i].getName()),field[i].getType());
            	method.invoke(target,field[i].get(source));
        	}catch(Exception e){
        		continue;
        	}
        }
        // your code here
    }
	private static String capitalize(String name){
		StringBuffer sb=new StringBuffer();
		sb.append(name);
		sb.replace(0, 1, sb.substring(0,1).toUpperCase());
		return sb.toString();
	}
	public static void main(String[] args) {
        User1 source = new User1(1);
        source.setName("tianmaying");
        User1 target = new User1(2);
        System.out.println("sourse is: " + source);
        System.out.println("target is: " + target);
        copyProperties(source, target);
        System.out.println("target is: " + target);
    }
}
