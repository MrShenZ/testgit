package com.woaixuexi6;

public class ZiFuChuan3 {
	public static void main(String args[]){
		String str="abcdefg";
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb.append("123456789");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(4, 'a');
		System.out.println(sb);
		sb.replace(2, 3, "   ");
		System.out.println(sb);
		sb.insert(3, "ssss");
		System.out.println(sb);
	}
}
