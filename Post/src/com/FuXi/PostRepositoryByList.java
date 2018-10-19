package com.FuXi;

import java.util.List;
import java.util.ArrayList;

public class PostRepositoryByList {
	private static List<Post> posts=new ArrayList<Post>();
	public static void add(Post post){
		posts.add(post);
	}
	public static void remove(long id){
		for(Post post:posts){
			if(post.getId()==id){
				posts.remove(post);
				break;
			}
		}
	}
	public static Post getPostById(long id){
		for(Post post:posts){
			if(post.getId()==id){
				return post;
			}
		}
		return null;
	}
	public static List<Post> getAll(){
		return posts;
	}
}
