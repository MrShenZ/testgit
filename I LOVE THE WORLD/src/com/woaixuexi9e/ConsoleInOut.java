package com.woaixuexi9e;
import java.io.*;

public class ConsoleInOut {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=null;
		try{
			isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("请输入");
			String x;//char x;
			do{
				x=(String)br.readLine();//x=(char)isr.read();
				System.out.println(x);
			}while(x.equals("我")!=true);//(x!='a');
		}finally{
			if(isr!=null){
				isr.close();
			}
		}
	}
}
