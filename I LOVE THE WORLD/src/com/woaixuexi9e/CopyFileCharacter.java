package com.woaixuexi9e;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacter {
	public static void main(String args[]) throws IOException{
		FileReader in=null;
		FileWriter out=null;
		try{
			in=new FileReader("input.txt");
			out=new FileWriter("output.txt");
			int x;
			while((x=in.read())!=-1){
				out.write(x);
			}
		}finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}
}
