package com.day23;

import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your Contact number: ");
			String contact = sc.next();
			// Lambda expression with single parameter.
			Sayable s1 = (Contact) -> {
				return "" + contact.matches("(0/91)?[7-9][0-9]{9}");
			};
			System.out.println(s1.say(" "));
		}
	}

}
