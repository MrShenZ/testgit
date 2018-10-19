package com.woaixuexi8;

public class Triple<A,B,C> {
	private A a;
    private B b;
    private C c;
    public A getA() {
        return a;
    }
    public void setA(A a) {
        this.a = a;
    }
    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    public C getC() {
        return c;
    }
    public void setC(C c) {
        this.c = c;
    }
    public static void main(String args[]){
    	Triple<String, Integer, Float> triple=new Triple<String,Integer,Float>();
    	triple.setA("Œ“∞Æ—ßœ∞£°");
    	triple.setB(1);
    	triple.setC(2.34f);
    	System.out.println(triple.a+triple.b+triple.c);
    }
}
