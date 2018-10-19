package com.FuXi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostRepositoryByMap implements PostRepository{
	private static final PostRepository prm=new PostRepositoryByMap();//创建私有实例
	public static PostRepository instance(){//创建公有返回实例的静态方法
		return prm;
	}
	private PostRepositoryByMap(){}//重载构造器为私有
	private static Map<Long,Post> postsMap=new HashMap<Long,Post>();
	public void add(Post post){
		postsMap.put(post.getId(), post);
	}
	public void remove(long id){
		postsMap.remove(id);
	}
	public Post getPostById(long id){
		return postsMap.get(id);
	}
	public List<Post> getAll(){
		List<Post> posts=new ArrayList<>();
		posts.addAll(postsMap.values());
		return posts;
	}
	public static List<Post> getAll2(){
		List<Post> posts=new ArrayList<>();
		for(Map.Entry<Long, Post> post:postsMap.entrySet()){
			posts.add(post.getValue());
		}
		return posts;
	}
	public static Post[] sortById(Post[] posts){
		Arrays.sort(posts,new Comparator<Post>(){
			public int compare(Post o1,Post o2){
				return o1.getId()<o2.getId()?-1:1;
			}
		});
		return posts;
	}
	public void loadData(){
		
	}
	public void saveData(){
		
	}
}
