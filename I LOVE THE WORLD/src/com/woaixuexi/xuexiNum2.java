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
		System.out.print("�����һ���ַ���");
		s1=scan.nextLine();
		System.out.print("����ڶ����ַ���");
		s2=scan.next();
		System.out.println("������ַ���"+s1+" "+s2);
		scan.close();
	}
}
