package com.exam.interfacee;

public class poisonBerry implements fruit {

	public static void main(String[] args) {
		 poisonBerry b = new poisonBerry();
		 b.isPoisonous();
		 b.isSweet();

	}


	public void isSweet() {
		System.out.println("soSweet");
		
	}

	
	public void isPoisonous() {
		System.out.println("soPoisonous");
		
	}

}
