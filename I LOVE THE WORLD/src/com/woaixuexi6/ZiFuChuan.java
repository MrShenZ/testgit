package com.woaixuexi6;

public class ZiFuChuan {
	public static void main(String arg[]){
		String name="David";
		int age=18;
		String hobby="����";
		String str="�ҵ�������"+name+"���ҽ���"+age+"�꣬�ҵİ�����"+hobby;
		System.out.println(str);
		
		String fStr="�ҵ�������%s���ҽ���%d�꣬�ҵİ�����%s";
		String forStr=String.format(fStr, name,age,hobby);
		System.out.println(forStr);
		
		String fStr1="�ҵ�������%s���ҽ���%d�꣬�ҵİ�����%s";
		System.out.format(fStr1+"\n",name,age,hobby);
		
		System.out.format("�ҵ�������%s���ҽ���%d�꣬�ҵİ�����%s", name, age, hobby);
	}
}
