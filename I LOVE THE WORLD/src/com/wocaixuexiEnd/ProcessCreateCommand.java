package com.wocaixuexiEnd;

import java.util.Scanner;

import com.woaixuexi7.Post;
import com.woaixuexi9and12.PostJiHeByMap;

public class ProcessCreateCommand {
	public static void main(String args[]){
		//PostRepositoryByList.instance();
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入博客名");
		String title=scan.nextLine();
		System.out.println(title);
		System.out.println("请输入内容，“wq”结束");
		StringBuffer content=new StringBuffer();
		while(true){
			String word=scan.nextLine();
			if(word.equals("wq")){
				break;
			}
			content.append(word);
			content.append("\n");
		}
		Post post=new Post(title, content.toString());
		post.print();
		PostJiHeByMap pm1=new PostJiHeByMap();
		pm1.add(post);
		scan.close();
	}
}
