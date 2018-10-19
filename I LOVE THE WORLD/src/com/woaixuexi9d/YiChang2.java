package com.woaixuexi9d;

public class YiChang2 {
	private static void bar() throws ZiDingYi{
		System.out.println("ZiDingYi");
		throw new ZiDingYi("create");
	}
	private static void fun(){
		int x=5/0;
		System.out.println(x);
	}
	public static void main(String args[]){
		try{
			fun();
			bar();
		}catch(ZiDingYi e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("程序异常");
		}
		System.out.println("继续执行");
	}
}
