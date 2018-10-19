package com.FuXi;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class FuXi5 implements Serializable{
	private static final long serialVersionUID=-1l;
	private static String preproty="不能访问类的属性";
	public static void getPackageClass(){
		FuXi5 fx=new FuXi5();
		System.out.println(fx.getClass().getName());
	}
	public static void getClassThree()throws Exception{
		Class<?> fx1=new FuXi5().getClass();
		Class<?> fx2=FuXi5.class;
		Class<?> fx3=Class.forName("com.Blog.FuXi5");
		System.out.println(fx1.getName()+" "+fx2.getName()+" "+fx3.getName());
	}
	public static void getParentInterface(){
		Class<?> fx=new FuXi5().getClass();
		Class<?> fx1=fx.getSuperclass();
		Class<?> fx2[]=fx.getInterfaces();
		StringBuffer str=new StringBuffer();
		for(int i=0;i<fx2.length;i++){
			str.append(fx2[i].getName());
		}
		System.out.println(fx1.getName()+"  "+str.toString());
	}
	public static void getnewInstance()throws Exception{
		Class<?> fx=new Post().getClass();
		Constructor<?> fx1[]=fx.getConstructors();
		for(int i=0;i<fx1.length;++i){
			Class<?> fx2[]=fx1[i].getParameterTypes();
			System.out.print(i);
			for(int j=0;j<fx2.length;++j){
				if(j==fx2.length-1)
					System.out.print(fx2[j].getName());
				else
					System.out.print(fx2[j].getName()+",");
			}
			System.out.println();
		}
		Post post=(Post)fx.newInstance();
		post=(Post)fx1[2].newInstance(100,"记住print","未知类读取很有效");
		System.out.println(post);
	}
	public static void getDeclaredFields()throws Exception{
		Class<?> fx=new FuXi5().getClass();
		Field fx1[]=fx.getDeclaredFields();//fx.getFields();
		for(int i=0;i<fx1.length;++i){
			int mo=fx1[i].getModifiers();
			String xsf=Modifier.toString(mo);
			Class<?> fx2=fx1[i].getType();
			System.out.println(xsf+" "+fx2+" "+fx1[i].getName()+";");
		}
	}
	public static void setDeclaredField()throws Exception{
		Class<?> fx=new FuXi5().getClass();
		Field fx1=fx.getDeclaredField("preproty");
		fx1.setAccessible(true);
		FuXi5 newFx=(FuXi5)fx.newInstance();
		fx1.set(newFx, "访问类的属性");
		System.out.println(fx1.get(newFx));
	}
	public static void getMethods()throws Exception{
		Class<?> fx=new FuXi5().getClass();
		Method fx1[]=fx.getDeclaredMethods();
		for(int i=0;i<fx1.length;++i){
			int mo=fx1[i].getModifiers();
			String xsf=Modifier.toString(mo);
			Class<?> rt=fx1[i].getReturnType();
			Class<?> types[]=fx1[i].getParameterTypes();
			System.out.print(xsf.toString()+" "+rt.getName()+" "+fx1[i].getName()+"(");
			for(int j=0;j<types.length;++j){
				if(j==types.length-1){
					System.out.print(types[j].getName()+" "+"arg"+j);
				}else{
					System.out.print(types[j].getName()+" "+"arg"+j+",");
				}
			}
			System.out.print(")");
			Class<?> exce[]=fx1[i].getExceptionTypes();
			if(exce.length>0){
				System.out.print("throws ");
				for(int z=0;z<exce.length;++z){
					if(z==exce.length-1)
						System.out.print(exce[z].getName());
					else
						System.out.print(exce[z].getName()+",");
				}
			}
			System.out.println();
		}
	}
	public void reflect(long id,String title){
		System.out.println(id+title);
	}
	public static void setMethods()throws Exception{
		Class<?> fx=new FuXi5().getClass();
		Method fx1=fx.getMethod("reflect",long.class,String.class);
		fx1.invoke(fx.newInstance(), 999,"调用方法");
	}
	public static void main(String args[])throws Exception{
		FuXi5.getPackageClass();
		FuXi5.getClassThree();
		FuXi5.getParentInterface();
		System.out.println("分界线——————————————————————————————");
		FuXi5.getnewInstance();
		System.out.println("分界线——————————————————————————————");
		FuXi5.getDeclaredFields();
		System.out.println("分界线——————————————————————————————");
		System.out.println(preproty);
		FuXi5.setDeclaredField();
		System.out.println("分界线——————————————————————————————");
		FuXi5.getMethods();
		System.out.println("分界线——————————————————————————————");
		FuXi5.setMethods();
	}
}
