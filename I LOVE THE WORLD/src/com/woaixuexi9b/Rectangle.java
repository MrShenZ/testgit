package com.woaixuexi9b;

public class Rectangle extends Graph {
	int width;
	int height;
	public Rectangle(){
		super();
	}
	public Rectangle(String name){
		super(name);
	}
	public Rectangle(int width,int height,String name){
		this(name);
		System.out.println("宽度为"+width+"高度为"+height);
	}
	public void show(){
		super.show();
		System.out.println("同时我是一个长方形");
	}
	public static void main(String args[]){
		Rectangle rec=new Rectangle(10,20,"小学生");
		rec.show();
	}
}
