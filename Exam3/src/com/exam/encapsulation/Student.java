package com.exam.encapsulation;

public class Student {


	private String name ;
	private String department ;
	private int age ;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		}


	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department =department;
		}
	
	public void setage(int age) {
		this.age=age;
		}

	public int getage() {
		return age;
	}

}
