package com.woaixuexi8;

public class Point1<T> {
	private T x;
	private T y;
	public T getX(){
		return x;
	}
	public void setX(T x){
		this.x=x;
	}
	public T getY(){
		return y;
	}
	public void setY(T y){
		this.y=y;
	}
	public static void main(String args[]){
		Point1<Integer> point=new Point1<Integer>();
		point.setX(1);
		point.setY(1);
		System.out.println(point.x+point.y);
		
		Point1<Double> point1=new Point1<Double>();
		point1.setX(3.456);
		point1.setY(4.789);
		System.out.println(point1.x+point1.y);
	}
}
