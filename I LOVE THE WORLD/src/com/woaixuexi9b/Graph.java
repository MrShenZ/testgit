package com.woaixuexi9b;

public class Graph {
	String name;
	long t;
	public final static String F="������������޸�";
	public Graph(){}
	public Graph(String name){
		this.name =name;
	}
	public void show(){
		System.out.println("����һ��ͼ��");
	}
	public long getT() {
		return t;
	}
	public void setT(long t) {
		this.t = t;
	}
}

