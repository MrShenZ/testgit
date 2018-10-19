package com.FuXi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FuXi3 {
	public static void main(String args[])throws IOException{
		Reader input=null;
		try{
			input=new InputStreamReader(System.in);
			System.out.println("输入字符'q'退出");
			char z;
			do{
				z=(char)input.read();
				System.out.println(z);
			}while(z!='q');
		}finally{
			if(input!=null){
				input.close();
			}
		}
		InputStream in=null;
		OutputStream out=null;
		try{
			in=new FileInputStream("input.txt");
			out=new FileOutputStream("output.txt");
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
		Reader ins=null;
		Writer outs=null;
		try{
			ins=new FileReader("input.txt");
			outs=new FileWriter("output.txt");
			int y;
			while((y=ins.read())!=-1){
				outs.write(y);
			}
		}finally{
			if(ins!=null){
				ins.close();
			}
			if(outs!=null){
				outs.close();
			}
		}
	}
}
