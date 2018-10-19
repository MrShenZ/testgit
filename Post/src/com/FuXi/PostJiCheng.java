package com.FuXi;

public class PostJiCheng extends Post {
	private String ye;
	public PostJiCheng(){
		super();
	}
	public PostJiCheng(String title,String content,String ye){
		super(title, content);
		this.ye=ye;
	}
	public void setId(long id){//方法覆盖
		super.setId(1);
		ye="第一页";
		super.setContent(ye);
	}
	long id;
}
