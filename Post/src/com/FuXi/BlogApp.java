package com.FuXi;

import java.util.Scanner;

public class BlogApp {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		while(true){
			String command=scan.nextLine();
			System.out.println(command);
			if(command.equals("exit")){
				break;
			}else if(command.equals("create")){
				
			}else if(command.equals("show")){
				
			}else if(command.equals("list")){
				
			}else if(command.equals("delete")){
				
			}else{
				continue;
			}
		}
		scan.close();
	}
}
