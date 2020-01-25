package com.exam.encapsulation;

import java.util.Scanner;

public class StudentExcution extends Student {

	public static void main(String[] args) {
		System.out.println("please enter you name , department & age :");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		int c = scan.nextInt();
		StudentExcution ct= new StudentExcution();
		ct.setname(a);
		System.out.println(ct.getname());
		ct.setdepartment(b);
		System.out.println(ct.getdepartment());
		ct.setage(c);
		System.out.println(ct.getage());

	}

}
