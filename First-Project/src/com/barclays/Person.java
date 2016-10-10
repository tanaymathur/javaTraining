package com.barclays;

public class Person {
	//DATA MEMBERS
	private String name;
	private int age;
	
	public static int count;
	//MEMBER METHODS
	
	public Person() {
		name = "NOt Avaail";
		age = 23;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge(){
		return age;
	}
}
