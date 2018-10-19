package com.woaixuexi;
import java.util.Scanner;
public class xuexiNum2 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
        scan.nextLine();
        String s1,s2;
		/*Scanner scan=new Scanner(System.in);*/
		System.out.print("输入第一个字符：");
		s1=scan.nextLine();
		System.out.print("输入第二个字符：");
		s2=scan.next();
		System.out.println("输入的字符是"+s1+" "+s2);
		scan.close();
	}
}
