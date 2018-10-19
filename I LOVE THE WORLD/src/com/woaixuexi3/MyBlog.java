package com.woaixuexi3;

import java.util.Scanner;

public class MyBlog {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		while(true){
			String str=scan.nextLine();
			System.out.println(str);
			if(str.equals("exit")){
				break;
			}else if(str.equals("create")){
				System.out.println("��������");
			}else if(str.equals("list")){
				System.out.println("��ʾ�����б�");
			}else if(str.equals("show")){
				System.out.println("��ʾ��������");
			}else if(str.equals("delete")){
				System.out.println("ɾ������");
			}else{
				continue;
			}
		}
		scan.close();
	}
}
