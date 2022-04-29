package com.individuallogin;

public class CreateNewAccount {

	public static void main(String[] args) {

		String a = "java";
		String output = "";

		for (int i = a.length() - 1; i >= 0; i--) {

			char charAt = a.charAt(i);
			output = output + charAt;
		}

		System.out.println("Reverse of String :" + output);
	}

}
