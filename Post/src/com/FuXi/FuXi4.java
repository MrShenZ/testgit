package com.FuXi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FuXi4 {
	public static void FileRead(){
		try{
		byte bWrite[]={48,97,65,57,70};
		OutputStream out=new FileOutputStream("text.txt");
		for(int i=0;i<bWrite.length;i++){
			out.write(bWrite[i]);
		}
		out.close();
		InputStream in=new FileInputStream("text.txt");
		int size=in.available();
		for(int i=0;i<size;i++){
			System.out.println((char)in.read()+" ");
		}
		in.close();
		}catch(IOException e){
			System.out.println("IO异常");
		}
	}
	public static void FileCaoz()throws IOException{
		File dir=new File("D:/java");
		File file1=new File(dir,"file1.txt");
		File file2=new File(dir,"file2.java");
		if(!dir.exists())
			dir.mkdir();
		if(!file1.exists())
			file1.createNewFile();
		if(!file2.exists())
			file2.createNewFile();
		System.out.println("file1's AbsolutePath=  " + file1.getAbsolutePath());  
        System.out.println("file2's AbsolutePath=  " + file2.getAbsolutePath());  
        
        System.out.println("file1 Canread=" + file1.canRead());  
        System.out.println("file1's len= " + file1.length());  
        
        String[] fileList = dir.list(); 
        System.out.println("there are " + fileList.length + " file(s) in D:/java"); 
	}
	public static void main(String args[]) throws IOException{
		FuXi4.FileRead();
		FuXi4.FileCaoz();
	}
}
