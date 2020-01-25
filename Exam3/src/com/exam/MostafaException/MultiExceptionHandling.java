package com.exam.MostafaException;

public class MultiExceptionHandling {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		int result;
		try {
			result = a / b;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("Zero exption");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("exption hapeen");	
		} catch (Exception e2) {
			System.out.println("exp hapeen");	
		} 
		finally

		{
			System.out.println("done");
		}

	}

}
