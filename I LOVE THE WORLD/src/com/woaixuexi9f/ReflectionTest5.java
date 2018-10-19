package com.woaixuexi9f;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest5 implements Serializable {
	private static final long serialVersionUID=-1l;
	public static void main(String args[])throws Exception{
		Class<?> clazz=new ReflectionTest5().getClass();
		Method method[]=clazz.getMethods();
		for(int i=0;i<method.length;++i){
			int xsf=method[i].getModifiers();
			Class<?> returnType=method[i].getReturnType();
			Class<?> para[]=method[i].getParameterTypes();
			System.out.print(Modifier.toString(xsf)+" ");
			System.out.print(returnType.getName()+" ");
			System.out.print(method[i].getName()+"(");
			for(int j=0;j<para.length;++j){
				System.out.print(para[j].getName()+" "+"arg"+j);
				if(j<para.length-1){
					System.out.print(",");
				}
			}
			Class<?> exce[]=method[i].getExceptionTypes();
			if(exce.length>0){
				System.out.print(") throws ");
				for(int x=0;x<exce.length;++x){
					System.out.print(exce[x].getName());
					if(x<exce.length-1){
						System.out.print(",");
					}
				}
			}else{
				System.out.print(")");
			}
			System.out.println();
		}
	}
}
