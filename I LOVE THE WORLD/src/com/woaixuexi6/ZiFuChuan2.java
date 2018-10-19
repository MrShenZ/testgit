package com.woaixuexi6;

public class ZiFuChuan2 {
	public static void main(String args[]){
		String str1=new String("abcabcdefea eabc ");
		String str2=new String("Abcabcdefea eabc ");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		boolean an;
		an=str1.equalsIgnoreCase(str2);
		System.out.println(an);
		
		int br;
		br=str1.compareToIgnoreCase(str2);
		System.out.println(br);
		
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf("e",3));
		System.out.println(str1.lastIndexOf("e",7));
		System.out.println(str1.startsWith("c", 2));
		System.out.println(str1.replace(" ",""));
		System.out.println(str1.substring(0, 6));
		System.out.println(str2.trim());
	}
}
