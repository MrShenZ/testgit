package com.woaixuexi9d;

public class YiChang {
	public static void main(String args[]){
		try{
			int x=5/0;
			System.out.println(x);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("程序还在这里运行！");
	}
}
