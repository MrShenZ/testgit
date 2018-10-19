package com.woaixuexi8;

public class Point {
	public static <T> void pointArray(T[] object){
		if(object!=null){
			for(T xinFan:object){
				System.out.format("%s",xinFan);
			}
		}
	}
	public static void main(String args[]){
		Integer[] intArray={1,2,3,4,5};
		Character[] charArray={'a','b','c','d'};
		pointArray(intArray);
		System.out.println();
		pointArray(charArray);
	}
}
class ShiZhan{
	public static <T extends Comparable<T>> T getMax(T t1,T t2){
		if(t1.compareTo(t2)<0){
			t1=t2;
		}
		return t1;
	}
}

