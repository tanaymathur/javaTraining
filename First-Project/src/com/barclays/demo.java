package com.barclays;

public class demo {
	  private static int x=1;
	  static void m1(int x, Integer y) {x++; y++;}
	  public static void main (String[] args) {
	    int y=3;
	    Integer I = new Integer(3);
	    m1(I, y);
	    System.out.println(x + "," + I);
	}
}

