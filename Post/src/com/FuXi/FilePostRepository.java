package com.FuXi;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class FilePostRepository extends PostRepositoryByList{
	public static final String FOLDER="TMY=BLOG";
	public static final String SEPARATOR="---";
	public static void processCreateCommand(){
		System.out.println("请写入博客的标题");
		Scanner scan=new Scanner(System.in);
		String title=scan.nextLine();
		System.out.println("请输入内容");
		StringBuffer content=new StringBuffer();
		while(true){
			String word=scan.nextLine();
			if(word.equals("wq")){
				break;
			}
			content.append(word);
			content.append("\n");
		}
		scan.close();
		Post post=new Post(title,content.toString());
		PostRepositoryByMap.instance().add(post);
	}
	public static void loadData()throws BlogAppException{
		File dir=new File(FOLDER);
		List<File> files=(List<File>)FileUtils.listFiles(dir, null, true);
		for(File file:files){
			try{
				String Name[]=file.getName().split(SEPARATOR);
				long id=Long.parseLong(Name[0].toString());
				String title=Name[1].toString();
				String content=FileUtils.readFileToString(file,"utf-8");
				Post post=new Post(id,title,content);
				PostRepositoryByMap.instance().add(post);
			}catch(IOException e){
				e.printStackTrace();
				BlogAppException be=new BlogAppException("load");
				be.initCause(e);
				throw be;
			}catch(NumberFormatException e){
				e.printStackTrace();
				BlogAppException be=new BlogAppException("load");
				be.initCause(e);
				throw be;
			}
		}
	}
	public static void saveData()throws BlogAppException{
		for(Post post:PostRepositoryByMap.instance().getAll()){
			String fileName=Long.toString(post.getId())+SEPARATOR+post.getTitle();
			File file=new File(FOLDER+File.separator+fileName);
			try{
				FileUtils.write(file, post.getContent(),"utf-8");
			}catch(IOException e){
				e.printStackTrace();
				BlogAppException be=new BlogAppException("save");
				be.initCause(e);
				throw be;
			}
		}
	}
}
