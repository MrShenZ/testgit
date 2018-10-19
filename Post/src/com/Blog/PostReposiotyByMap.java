package com.Blog;

import java.util.Map;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostReposiotyByMap implements PostRepository{
	private static final String FOLDER="BLOGS";
	private static final String SEPARATOR="---";
	private static PostRepository postRepository;
	public static PostRepository instance(){
		if(postRepository==null){
			postRepository=new PostReposiotyByMap();
		}
		return postRepository;
	}
	private PostReposiotyByMap(){}
	private static Map<Long, Post> posts=new HashMap<Long,Post>();
	public void add(Post post){
		posts.put(post.getId(), post);
	}
	public Post getPostById(long id){
		return posts.get(id);
	}
	public void remove(long id){
		posts.remove(id);
	}
	public List<Post> getAll(){
		List<Post> postx=new ArrayList<Post>();
		postx.addAll(posts.values());
		return postx;
	}
	public void loadData()throws BlogAppException{
		File dir=new File(FOLDER);
		List<File> files=(List<File>)FileUtils.listFiles(dir,null, true);
		try{
			for(File file:files){
				String fileName[]=file.getName().split(SEPARATOR);
				long id=Long.parseLong(fileName[0]);
				String title=fileName[1].toString();
				String content=FileUtils.readFileToString(file,"utf-8");
				Post post=new Post(title, content);
				post.setId(id);
				postRepository.add(post);
			}
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
	public void saveData()throws BlogAppException{
		for(Post post:postRepository.getAll()){
			String fileName=Long.toString(post.getId())+SEPARATOR+post.getTitle();
			try{
				FileUtils.write(new File(FOLDER+File.separator+fileName),post.getContent(),"utf-8");
			}catch(IOException e){
				e.printStackTrace();
				BlogAppException be=new BlogAppException("save");
				be.initCause(e);
				throw be;
			}
		}
	}
}
