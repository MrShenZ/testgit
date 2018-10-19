package com.woaixuexi8;

public class Printer {
	public static <T> void printArray(T[] objects) {
        if (objects != null) {
            for(T element : objects){  
                System.out.printf("%s",element);  
            }  
        }
    }
    
    public static void main(String[] args) {  
        Integer[] intArray = { 1, 2, 3, 4, 5 };  
        Character[] charArray = { 'T', 'I', 'A', 'N', 'M', 'A', 'Y', 'I', 'N', 'G' };
        
        printArray(intArray);
        printArray(charArray);
    }     
}