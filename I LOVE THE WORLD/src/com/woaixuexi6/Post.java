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
public static void main(String args[]){
    	Post post=new Post();
    	post.print();
    }
}
