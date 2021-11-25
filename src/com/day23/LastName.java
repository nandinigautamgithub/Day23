package com.day23;

public class LastName {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable s1 = (lastname) -> {
			return "" + lastname.matches("[A-Z][a-z]*{3}");
		};
		System.out.println(s1.say("Sharma"));

	}

}
