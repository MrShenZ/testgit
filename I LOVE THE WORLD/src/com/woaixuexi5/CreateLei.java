package com.woaixuexi5;

public class CreateLei {
	public static void main(String args[]){
		Engine engine=new Engine(180);
		Car car=new Car(100,200,engine);
		car.color=0xffffff;
		int color=car.color;
		double eng=engine.power;
		car.run();
		System.out.println(color+" "+eng);
		
		Post post =new Post(null,null,123);
		System.out.println(post.content);
		post.a="天码营";
		post.b="大牛";
		System.out.println(post.a+post.b+post.id);
	}
}
class Post{
	public String title="标题";
	public String content=inContent();
	public final String inContent(){
		return "内容";
	}
	
	public long id;
	public String a;
	public String b;
	{
		a="我在";
		b="编程";
	}
	public Post(){}
	public Post(String a,String b,long id){
		a="我是";
		b="学生";
		this.a=a;
		this.b=b;
		this.id=id;
	}
}