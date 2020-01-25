package com.exam.interfacee;

public class Apple implements fruit {

	public static void main(String[] args) {

		Apple a = new Apple();
		a.isSweet();
		a.isPoisonous();
	}

	
	public void isSweet() {
		System.out.println("Sweet");

	}

	
	public void isPoisonous() {
		System.out.println("Poisonous");

	}

}
