package com.woaixuexi7;

public class Post {
	public String title;
	public String content;
	public long id;
	private static int count=0;
	static{
		count=0;
	}
	public Post(){
		count++;
		id=count;
	}
	public long getCount(){
		return count;
	}
	public static void main(String args[]){
		Post post=new Post();
		post.getId();
		System.out.println(Post.count);
		
	}
	
	public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.id=count++;
    }

    public Post(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

	public void print() {
	    StringBuffer sb=new StringBuffer();
	    Post post=new Post(100l,"����Ӫ��һƪ����","����Ӫ�����ü���ѧϰ���Ӹ�Ч�ͱ�ݵ�ʹ���������ڴ�����һ���ļ���ѧϰ����ƽ̨���ṩ���²���רҵ�����ݡ���������񣬰���ѧϰ�����ҵ��ʵ�ָ��˼�ֵ��");
	    sb.append("<html>"+"\n");
	    sb.append("<head>"+"\n");
	    sb.append("<title>"+post.title+"</title>"+"\n");
	    sb.append("</head>"+"\n");
	    sb.append("<body>"+"\n");
	    sb.append("  <h1>"+post.id+". "+post.title+"</h1>"+"\n");
	    sb.append("  <p>"+post.content+"</p>"+"\n");
	    sb.append("</body>"+"\n");
	    sb.append("</html>");
	    System.out.println(sb);
	    // your code here����ӡHTML��ʽ�Ĳ���
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
	
}