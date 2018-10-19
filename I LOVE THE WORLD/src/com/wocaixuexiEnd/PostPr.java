package com.wocaixuexiEnd;

import com.woaixuexi9and12.PostJiHeByMap;

public class PostPr {
	private static final PostJiHeByMap pm=new PostJiHeByMap();
	public static PostJiHeByMap instance(){
		return pm;
	}
	private PostPr(){}
}
