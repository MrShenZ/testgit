package com.woaixuexi4;

public class MakeLei {
	public static void main(String args[]){
		System.out.println("wo");
		Post post=new Post("����Ӫ�γ�", "����ѧϰ");
		String post1=post.title+post.content;
		System.out.println(post1);
	}
}
class Post{
	String title;
	String content;
	public Post(String title){
		this.title=title;
	}
	public Post(){}
	public Post(String title,String content){
		this(title);
		this.content=content;
	}
}
class Car{
	int speed;
	int color;
	Engine engine;
	
	int arr(int a){
		return a;
	}
	int arr(){
		int b=0;
		return b;
	}
}
class Engine{
	double power;
}