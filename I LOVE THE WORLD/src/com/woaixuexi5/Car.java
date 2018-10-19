package com.woaixuexi5;

public class Car {
		public int color;
		private int speed;
		public Engine engine;
		public Car(){}
		public Car(int color,int speed){
			this.color=color;
			this.speed=speed;
		}
		public Car(int color,int speed,Engine engine){
			this(color,speed);
			engine.power=300;
			engine=null;
			this.engine=engine;
		}
		void startup(){
			System.out.println("启动！");
		}
		void run(){
			startup();
			System.out.println("前进，速度为："+this.speed);
		}
}
class UseCar{
		Engine engine=new Engine(180);
		Car car=new Car(900,100,engine);
		Car myCar=new Car();
}
