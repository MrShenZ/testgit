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
		System.out.println("���Ϊ"+width+"�߶�Ϊ"+height);
	}
	public void show(){
		super.show();
		System.out.println("ͬʱ����һ��������");
	}
	public static void main(String args[]){
		Rectangle rec=new Rectangle(10,20,"Сѧ��");
		rec.show();
	}
}
