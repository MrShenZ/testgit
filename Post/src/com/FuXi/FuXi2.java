package com.FuXi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FuXi2{
	public static <T> void printArray(T[] object){
		for(T t:object){
			System.out.format("%s", t);
		}
	}
	private static List<Post> posts=new ArrayList<>();
	public static void remove(long id){
		Iterator<Post> iter=posts.iterator();
		while(iter.hasNext()){
			Post post=iter.next();
			if(post.getId()==id){
				posts.remove(post);
				break;
			}
		}
	}
	LinkedList<Post> posts2=new LinkedList<>();
}
