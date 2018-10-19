package com.Blog;

import java.util.List;
import java.util.Scanner;

public class BlogApp {
	private static Scanner scanner;
	private static final String END_BOLG="end";
	private static PostRepository postRepository=PostReposiotyByMap.instance();
	private static void processCreateCommand(){
		System.out.println("请输入标题");
		String title=scanner.nextLine();
		System.out.println("请输入内容，"+END_BOLG+"命令结束");
		StringBuffer content=new StringBuffer();
		while(true){
			String word=scanner.nextLine();
			if(word.equals(END_BOLG)){
				break;
			}
			content.append(word);
			content.append("\n");
		}
		Post post=new Post(title, content.toString());
		post.print();
		postRepository.add(post);
	}
	private static void processShowCommand(){
		System.out.println("请输入要显示的博客ID");
		try{
			long id=Long.parseLong(scanner.nextLine().toString());
			postRepository.getPostById(id).print();
		}catch(NullPointerException e){
			System.out.println("ID不存在!");
		}catch(NumberFormatException e){
			System.out.println("请输入数字!");
		}
	}
	private static void processDeleteCommand(){
		System.out.println("请输入要删除的博客ID");
		try{
			long id=Long.parseLong(scanner.nextLine().toString());
			postRepository.remove(id);
		}catch(NullPointerException e){
			System.out.println("ID不存在!");
		}catch(NumberFormatException e){
			System.out.println("请输入数字!");
		}
	}
	private static void processListCommand(){
		List<Post> posts=postRepository.getAll();
		int i = 0;
		for(Post post:posts){
			i=i+1;
			System.out.println(i+"标题"+post.getTitle()+"\n"+"内容"+post.getContent());
		}
	}
	public static void main(String args[]){
		scanner=new Scanner(System.in);
		try{
			while(true){
				System.out.println("create创建；show显示；delete删除；list查看列表；"+"\n"+"load从文件加载博客；save保存博客到文件；exit退出");
				String command=scanner.nextLine();
				System.out.println(command);
				if(command.equals("exit")){
					break;
				}else if(command.equals("create")){
					processCreateCommand();
				}else if(command.equals("show")){
					processShowCommand();
				}else if(command.equals("delete")){
					processDeleteCommand();
				}else if(command.equals("list")){
					processListCommand();
				}else if(command.equals("load")){
					postRepository.loadData();
				}else if(command.equals("save")){
					postRepository.saveData();
				}else{
					continue;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			scanner.close();
		}
	}
}
