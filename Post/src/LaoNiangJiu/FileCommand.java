package LaoNiangJiu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;

public class FileCommand {
	private static File dir1=new File("D:/java/in.txt");
	private static File dir2=new File("D:/java/out.txt");
	private static String a;
	private static String b;
	public static void loadData() throws IOException{
		Reader fileIn=null;
		try{
			fileIn=new FileReader(dir1);
			int x;
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((x=fileIn.read())!=-1){
				if(x>=48 && x<=57){
					++i;
					sb.append((char)x);
					if(i%16==0){
						sb.append("---");
					}
				}
			}
			a=sb.toString();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			fileIn.close();
		}
	}
	public static void loadData1()throws IOException{
		Reader fileIn=null;
		try{
			fileIn=new FileReader(dir2);
			int x;
			StringBuffer sb=new StringBuffer();
			while((x=fileIn.read())!=-1){
				sb.append((char)x);
			}
			b=sb.toString();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void saveData()throws IOException{
		String number[]=a.toString().split("---");
		for(String onenumber:number){
			b=b.replaceFirst("No=&","No="+onenumber+"&");
		}
		Writer out=new FileWriter(dir2,false);
		out.write(b);
		out.close();
	}
	public static void main(String args[]) throws IOException{
		loadData();
		loadData1();
		saveData();
	}
}
