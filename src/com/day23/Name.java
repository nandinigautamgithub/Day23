package com.day23;

interface Sayable {
	public String say(String firstname);
}

public class Name {
	public static void main(String[] args) {
		// Lambda expression with single parameter.
		Sayable s1 = (firstname) -> {
			return "" + firstname.matches("[A-Z][a-z]*{3}");
		};
		System.out.println(s1.say("Gorge"));

	}

}
