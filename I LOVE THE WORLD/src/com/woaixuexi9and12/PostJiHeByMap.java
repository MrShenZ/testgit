package com.woaixuexi9and12;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.woaixuexi7.Post;
import com.woaixuexi9and12.PostYingSheByList.PostYingShe;
import com.woaixuexi9b.Rectangle;

public class PostJiHeByMap extends Rectangle implements PostYingShe {
	private static List<Post> posts=new ArrayList<Post>();
	public void add(Post post){
		posts.add(post);
	}
	public Post getPostById(long id){
		for(Post post:posts){
			if(post.getCount()==id){
				return post;
			}
		}
		return null;
	}
	public void remove(long id){
		for(Post post:posts){
			if(post.getCount()==id){
				posts.remove(post);
				return;
			}
		}
	}
	public List<Post> getAll(){
		return posts;
	}
	public void saveData(){
		
	}
	public void loadData(){
		
	}
	PostYingShe postys=new PostJiHeByMap();
	public void win(){
		postys.remove(1);
	}
	public static void removeTt(long id){
		Iterator<Post> iterator=posts.iterator();
		while(iterator.hasNext()){
			Post post=iterator.next();
			if(post.getCount()==id){
				posts.remove(post);
				return;
			}
		}
	}
	public static List<Post> search(String x){
		List<Post> post1=new ArrayList<>();
		for(Post post:posts){
			if(post.title.contains(x)==true){
				post1.add(post);
			}
		}
		return post1;
	}
}
