package com.wocaixuexiEnd;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

import com.woaixuexi7.Post;
import com.woaixuexi9d.ZiDingYi;

public class PostRepositoryByList{
	private static final String FOLDER="TMY-BLOG";
	private static final String SEPARATOR="---";
	public void loadData()throws ZiDingYi{
		File dir=new File(FOLDER);
		List<File> files=(List<File>)FileUtils.listFiles(dir, null, true);
		for(File file:files){
			try{
				String fileName[]=file.getName().split("---");
				String content=FileUtils.readFileToString(file,"utf-8");
				Post post=new Post(fileName[1], content);
				post.setId(Long.parseLong(fileName[0]));
				PostPr.instance().add(post);
			}catch(IOException e){
				e.printStackTrace();
				ZiDingYi zy=new ZiDingYi("load");
				zy.initCause(e);
				throw zy;
			}catch(NumberFormatException e){
				e.printStackTrace();
				ZiDingYi zy=new ZiDingYi("load");
				zy.initCause(e);
				throw zy;
			}
		}
	}
	public void savaData()throws ZiDingYi{
		//博客-存储>文件
		//遍历博客，得到id，title，content组成的文件名，存储内容 
		for(Post post:PostPr.instance().getAll()){
			String fileName=Long.toString(post.getId())+SEPARATOR+post.getTitle();
			try{
				File fileNames=new File(FOLDER+File.separator+fileName);
				FileUtils.write(fileNames, post.getContent(),"utf-8");;
			}catch(IOException e){
				e.printStackTrace();
				ZiDingYi zy=new ZiDingYi("sava");
				zy.initCause(e);
				throw zy;
			}
		}
	}
}
