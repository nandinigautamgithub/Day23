package com.day23;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your password: ");
	      String password = sc.next();
	      	   // Lambda expression with single parameter.
	   			Sayable s1 = (Password) -> {
	   				return "" + password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
	   			};
	   			System.out.println(s1.say(" "));


	}

}
