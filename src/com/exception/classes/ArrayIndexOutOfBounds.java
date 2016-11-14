package com.exception.classes;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		try{		
       int [] number= new int[100];
      System.out.println("Enter the value");
      int i = scanner.nextInt();
      number[i] = 5;
      System.out.println("ArrayIndexWithinOfBounds");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBounds");
		}
	}

}
