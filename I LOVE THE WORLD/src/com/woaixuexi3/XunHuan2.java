package com.woaixuexi3;

import java.util.Scanner;
public class XunHuan2 {
	public static void main(String args[]){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
		
		Scanner scan=new Scanner(System.in);
		int str=scan.nextInt();
		if(str%4==0 && str%100!=0 || str%400==0){
			System.out.println("闰年");
		}else{
			System.out.println("不是闰年");
		}
		scan.close();
	}
}
