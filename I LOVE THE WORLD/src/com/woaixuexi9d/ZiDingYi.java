package com.woaixuexi9d;

public class ZiDingYi extends Exception {
	private static final long serialVersionUID=1l;
	private final String command;
	public ZiDingYi(String command){
		this.command=command;
	}
	public String toString(){
		return "执行命令时发生异常"+command;
	}
}
