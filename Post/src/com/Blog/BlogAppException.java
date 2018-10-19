package com.Blog;

public class BlogAppException extends Exception{
	private static final long serialVersionUID=1l;
	private final String command;
	public BlogAppException(String command){
		this.command=command;
	}
	public String toString(){
		return "执行命令发生异常"+command;
	}
}
