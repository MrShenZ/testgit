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
		post.a="����Ӫ";
		post.b="��ţ";
		System.out.println(post.a+post.b+post.id);
	}
}
class Post{
	public String title="����";
	public String content=inContent();
	public final String inContent(){
		return "����";
	}
	
	public long id;
	public String a;
	public String b;
	{
		a="����";
		b="���";
	}
	public Post(){}
	public Post(String a,String b,long id){
		a="����";
		b="ѧ��";
		this.a=a;
		this.b=b;
		this.id=id;
	}
}