package com.FuXi;

public class Post {
	private long id;
	private String title;
	private String content;
	private static int count=0;
	public static final String DEFAULT_CONTENT="这个家伙很懒，什么都没写";
	public Post(){
		count++;
	}
	public Post(String title,String content){
		count++;
		this.title=title;
		this.content=content;
	}
	public Post(long id,String title,String content){
		count++;
		this.id=id;
		this.title=title;
		this.content=content;
	}
	public static final int getCount(){
		return count;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String toString(){
		return id+title+content;
	}
}
