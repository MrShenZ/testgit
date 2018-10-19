package com.FuXi;

import java.util.Scanner;

public class FuXi {
	public static void main(String args[]){
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer in=new Integer(100);
		long m=in.intValue();
		String s="123";
		int s1=Integer.parseInt(s);
		String s2=Integer.toString(s1);
		System.out.println(s2+m);
		String str1="abc";
		String str2="def";
		str1+=str2;
		str2=str1.substring(3, 5);
		System.out.println(str2);
		/*Scanner scan=new Scanner(System.in);
		scan.nextInt();
		scan.nextFloat();
		scan.nextLine();
		scan.next();
		scan.close();
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		scanner.close();*/
		String object="";
		if(object!=null && object==""){
			System.out.println("不为空");
		}else{
			System.out.println("空");
		}
		int a=10;
		long b=(long)a;
		long c=(long)100;
		String string="abcdefg";
		char anArray[]=string.toCharArray();
		for(char x:anArray){
			System.out.print(x);
		}
		int sum=0;
		for (int i=0;i<=100;i++){
			int x=i%2;
			switch(x){
			case 1:
				sum+=i;
				break;
			case 0:
				break;
			}
		}
		System.out.println(sum+b+c);
		Scanner scan=new Scanner(System.in);
		while(true){
			String command=scan.next();
			System.out.println(command);
			if(command.equals("exit")){
				break;
			}else if(command.equals("create")){
				
			}else if(command.equals("list")){
				
			}else if(command.equals("show")){
				
			}else if(command.equals("delete")){
				
			}else{
				continue;
			}
		}
		scan.close();
		String name="david";
		int age=18;
		String hobby="篮球";
		System.out.format("我叫%s，我今年%d，我喜欢%s",name,age,hobby);
	}
}
