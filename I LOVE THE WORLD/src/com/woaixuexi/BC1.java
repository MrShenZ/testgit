package com.woaixuexi;


public class BC1 {
	public static void main(String args[]){
		Car car=new Car();
		car.startup();
		car.run(400);
		God.main(args);
		System.out.println("天码营");
		long a=200;
        System.out.println(a);
        float b=90.999f;
        System.out.println(b);
        double c=66.666;
        System.out.println(c);
        boolean d=false;
        System.out.println(d);
        char e='我';
        System.out.println(e);
	}
}
class Car{
		int speed;
		int color;
		protected void startup(){
			System.out.println("天码营课程");
		}
		void run(int speed){
			System.out.println(speed);
		}
}
class God{
	public static void main(String args[]){
			Car car=new Car();
			car.startup();
			car.run(60);
	}
}