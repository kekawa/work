package sampleProj;

public class OverRoad {
	   public static void main(String args[]) {
		   metmsg("佐藤");
	       metmsg("山田", "はじめまして");
	   }
	   
	   static void metmsg(String name) {
	       System.out.println("こんにちは、" + name + "です");
	    }
	    
	    static void metmsg(String name, String greeting) {
	        System.out.println(greeting + "、" + name + "です");
	    }
}
