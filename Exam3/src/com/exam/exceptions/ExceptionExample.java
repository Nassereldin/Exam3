package com.exam.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) throws ZeroNumberException , NumberToolLargeException , NumberTooSmallExceptions {
	System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a==0) {
			throw new ZeroNumberException();
		}else if (a<=10000) {
			throw new NumberTooSmallExceptions();
		} else if (a>10000){
			throw new NumberToolLargeException();
		}

	}

}
