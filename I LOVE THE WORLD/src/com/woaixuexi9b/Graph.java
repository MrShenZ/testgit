package com.woaixuexi9b;

public class Graph {
	String name;
	long t;
	public final static String F="这个常量不可修改";
	public Graph(){}
	public Graph(String name){
		this.name =name;
	}
	public void show(){
		System.out.println("我是一个图表");
	}
	public long getT() {
		return t;
	}
	public void setT(long t) {
		this.t = t;
	}
}

