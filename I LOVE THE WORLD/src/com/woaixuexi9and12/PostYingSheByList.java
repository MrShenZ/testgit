package com.woaixuexi9and12;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.woaixuexi7.Post;

public class PostYingSheByList{
	
	private static Map<Long, Post> postsMap=new HashMap<Long,Post>();
	public static void add(Post post){
		postsMap.put(post.getCount(), post);
	}
	public static Post getPostById(long id){
		for(Map.Entry<Long, Post> postEntry:postsMap.entrySet()){
			Long id1=postEntry.getKey();
			Post post=postEntry.getValue();
			return postsMap.put(id1, post);
		}
		return postsMap.get(id);
	}
	public static void remove(long id){
		postsMap.remove(id);
	}
	public static List<Post> getAll(){
		List<Post> posts=new ArrayList<>();
		posts.addAll(postsMap.values());
		return posts;
	}
	public interface PostYingShe{
		public void add(Post post);
		public Post getPostById(long id);
		public void remove(long id);
		public List<Post> getAll();
		public void saveData();
		public void loadData();
	}
}
