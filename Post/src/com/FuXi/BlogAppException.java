package com.FuXi;

public class BlogAppException extends Exception{
	private static final long serialVersionUID=1l;
	private String command;
	public BlogAppException(){}
	public BlogAppException(String command){
		this.command=command;
	}
	public String toString(){
		return "执行命令时发生的异常！"+command;
	}
}
