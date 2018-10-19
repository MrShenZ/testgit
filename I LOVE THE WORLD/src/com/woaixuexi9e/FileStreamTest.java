package com.woaixuexi9e;

import java.io.*;

public class FileStreamTest {
	public static void main(String args[]) throws IOException{
		try{
			byte bWrite[]={10,20,30,40,50};
			OutputStream out=new FileOutputStream("test.txt");
			for(int i=0;i<bWrite.length;i++){
				out.write(bWrite[i]);
			}
			out.close();
			InputStream in=new FileInputStream("test.txt");
			int x=in.available();
			for(int i=0;i<x;i++){
				System.out.print((char)in.read()+"  ");
			}
			in.close();
		}catch(IOException e){
			System.out.print("IO®³£");
		}
	}
}
