package com.woaixuexi6;

public class Post {
		private Long id;
	    private String title;
	    private String content;
	
	    public Post() {
	    }
	
	    public Post(String title, String content) {
	        this.title = title;
	        this.content = content;
	    }
	
	    public Post(Long id, String title, String content) {
	        this.id = id;
	        this.title = title;
	        this.content = content;
	    }
    
	public void print() {
	    StringBuffer sb=new StringBuffer();
	    Post post=new Post(100l,"天码营的一篇博客","天码营秉承让技术学习更加高效和便捷的使命，致力于打造新一代的技术学习服务平台，提供创新并且专业的内容、工具与服务，帮助学习者与从业者实现个人价值。");
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
	    // your code here：打印HTML格式的博客
	}
public static void main(String args[]){
    	Post post=new Post();
    	post.print();
    }
}
