package com.woaixuexi;

public class Post {
	
	public static void main(String args[]){
		Zt post=new Zt();
		post.title="博客";
		post.content="我的博客";
		post.print();
		System.out.println(post);
		
		System.out.println("int类的二进制位数："+Integer.SIZE);
		System.out.println("int类型的最小值："+Integer.MIN_VALUE);
		System.out.println("int类型的最大值："+Integer.MAX_VALUE);
		Integer in=new Integer(100);
		int s1=in.intValue();
		String s="123";
		int n=Integer.parseInt(s);
		String s2=Integer.toString(n);
		System.out.println(s2+s1);
		
		int[] anArray={0,1,2,3,4,5,6,7,8,9};
		System.out.println(anArray[1]+anArray.length);
		
		String str="123456";
		str.substring(3,6);
		System.out.println(str);
		String str2=str.substring(3,6);
		System.out.println(str2);
		
		System.out.println(0.2f);
	}
}
class Zt{	
	String title;
	String content;
	void print(){
		System.out.println(title);
		System.out.println(content);
	}
}
