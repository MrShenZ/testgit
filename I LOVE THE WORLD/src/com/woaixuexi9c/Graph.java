package com.woaixuexi9c;

import com.woaixuexi9c.Graph.Animal;

public abstract class Graph{
	public abstract double area();
	public interface Animal{
		static final int TIMES_OF_EATING=3;
		void eat();
		void sleep();
	}
}
class Cat implements Animal{
	interface LuQiDongWu extends Animal{
		void run();
	}
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
	Animal cat=new Cat();
	public void win(){
		cat.eat();
	}
}
