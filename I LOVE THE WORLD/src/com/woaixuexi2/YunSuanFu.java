package com.woaixuexi2;

public class YunSuanFu{
	public static void main(String args[]){
		String str="abcd";
		if(str.equals("abcd")){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		float x=1/2f;
		float y;
		if(x<=0 || x>=1){
			y=x*(x-1);
		}else{
			y=-x*(x-1);
		}
		System.out.println(y);
		
		int a=0b00111100;
		int b=0b00001101;
		System.out.println((a&b)+(a|b)+(a^b)+(~a)+(a<<b)+(a>>b)+(a>>>b));
		
		if(x>=0){
			y=x;
		}else{
			y=-x;
		}
		System.out.println(y);
		System.out.println(x>=0?x:-x);
		
		int n=10;
		long z=(long)n;
		long c=(long)100;
		System.out.println(z+""+c);
		
		int t=10;
		int r=3;
		System.out.println(t/r);
		
	}
}
