package com.barclays;



public class Entry {
 public static void main(java.lang.String[] args) {
	 System.out.println("Hello,Worlds!");
	 Person p;
	 p= new Person();
	 System.out.println(p.getName());
	 System.out.println(Person.getCount());
	 p.getAge();	
 }
}
