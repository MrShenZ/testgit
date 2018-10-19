package com.woaixuexi6;

public class ZiFuChuan {
	public static void main(String arg[]){
		String name="David";
		int age=18;
		String hobby="篮球";
		String str="我的名字是"+name+"，我今年"+age+"岁，我的爱好是"+hobby;
		System.out.println(str);
		
		String fStr="我的名字是%s，我今年%d岁，我的爱好是%s";
		String forStr=String.format(fStr, name,age,hobby);
		System.out.println(forStr);
		
		String fStr1="我的名字是%s，我今年%d岁，我的爱好是%s";
		System.out.format(fStr1+"\n",name,age,hobby);
		
		System.out.format("我的名字是%s，我今年%d岁，我的爱好是%s", name, age, hobby);
	}
}
