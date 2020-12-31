package com.javaprogram.email;

import java.util.regex.*;

public class EmailSample {

	public static void main(String[] args)
	{
		System.out.println("Welcome to Email Samples");
		Pattern pattern=Pattern.compile("[a-z]{3,}@[a-z]{5,}.com");
		Matcher match1=pattern.matcher("abc@yahoo.com");
		Matcher match2=pattern.matcher("tejeswar@yahoo.com");
		boolean email1=match1.matches();
		System.out.println("Email1: "+email1);
		boolean email2=match2.matches();
		System.out.println("Email2: "+email2);
	}

}
