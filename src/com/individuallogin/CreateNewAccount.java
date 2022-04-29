package com.individuallogin;

public class CreateNewAccount {

	public static void main(String[] args) {

		String a = "java";
		String s = "Selenium";
		String out = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			out = out + c;

		}

		System.out.println("Revese of S :" + out);

	}

}
