package com.woaixuexi8;

public class Container<T> {
	private T variable;
	public Container(){
		variable=null;
	}
	public Container(T variable){
		this.variable =variable;
	}
	public T get(){
		return variable;
	}
	public void set(T variable){
		this.variable=variable;
	}
	public static void main(String args[]){
		Container<String> con=new Container<String>();
		con.get();
		con.set("我一定要把JAVA学精!");
		System.out.println(con.variable);
	}
}
