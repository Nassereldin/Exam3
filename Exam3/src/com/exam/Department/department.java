package com.exam.Department;

public class department {
String name="";
int id=0;
String location="";

	public static void main(String[] args) {

		department a = new department() {};
		
		department b = new department("mostafa", 23);
		
		System.out.println(b.name+" "+b.id);
		
		department c = new department("Mostafa", 23, "D.C");
		System.out.println(c.name+" "+c.id+" "+c.location);

	}

	public department() {}

	public department(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public department(String name, int id, String location) {
		this.name=name;
		this.id=id;
		this.location=location;
	}

}
