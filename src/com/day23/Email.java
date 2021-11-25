package com.day23;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String Email = sc.next();
	      	   // Lambda expression with single parameter.
	   			Sayable s1 = (email) -> {
	   				return "" + Email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+${3}");
	   			};
	   			System.out.println(s1.say(" "));
	}

}
