package com.woaixuexi3;

//import java.util.Scanner;

public class XunHuan {
	public static void main(String args[]){
		int i=1;
		int sum=0;
		while(i<=100){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		/*Scanner scan=new Scanner(System.in);
		while(true){
		String str=scan.next();
		if(str.equals("exit"))break;
		System.out.println(str);
		}
		scan.close();*/
		
		i=0;
		sum=0;
		do{
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum+""+i);
		
		for(i=0,sum=0;i<=100;i++){
			sum+=i;
		}
		System.out.println(sum);
		
		int[] anArray={0,1,2,3,4,5,6,7,8,9};
		for(int n=0;n<anArray.length;n++){
			System.out.print(anArray[n]+" ");
		}
		System.out.println();
		
		int[] an={0,1,2,3,4,5,6,7,8,9};
		for(int ar:an){
			System.out.print(ar+" ");
		}
	}
	public static int sumOfNumbers() {
	    int sum = 0;
	    for(int i = 0; i <= 100; i++) {
	        sum += i;
	    }
	    return sum;
	}
}
