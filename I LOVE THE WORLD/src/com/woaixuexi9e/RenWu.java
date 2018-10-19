package com.woaixuexi9e;

import java.io.IOException;
import java.io.*;


public class RenWu {
	    
    /**
     * д���ļ�
     * @param filePath �ļ��ľ��Ե�ַ
     * @param data ��Ҫд���ļ����ַ���
     * @param append �Ƿ����׷��ģʽ�����Ϊfalse���򸲸�ԭ�ļ������Ϊtrue�������ļ�ĩβ׷��
     * @throws IOException
     */
    public static void writeStringToFile(String filePath, String data, boolean append) throws IOException {
        File dir=new File(filePath);
        Writer out=new FileWriter(dir,append);
        out.write(data);
        out.close();
        // your code here
    }
    
    /**
     * ��ȡ�ļ�
     * @param filePath �ļ��ľ���·��
     * @return �ļ�������
     * @throws IOException
     */
    public static String readStringFromFile(String filePath) throws IOException {
        File dir=new File(filePath);
        Reader in=new FileReader(dir);
        int x;
        StringBuffer str=new StringBuffer();
        while((x=in.read())!=-1){
            str.append((char)x);
        }
        in.close();
        // your code here
        return str.toString();
    }
    
    public static void main(String[] args) throws IOException {
        String filePath = "/apps/test";
        writeStringToFile(filePath, "write String to test file\n", false);
        writeStringToFile(filePath, "append\n", true);
        writeStringToFile(filePath, "append\n", true);
        writeStringToFile(filePath, "append\n", true);
        System.out.println(readStringFromFile(filePath));
    }

}	


	