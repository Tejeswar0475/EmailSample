package com.javaprogram.email;

import java.util.regex.*;

public class EmailSample {

	public static void main(String[] args)
	{
		//UC1
		System.out.println("Welcome to Email Samples");
		Pattern pattern=Pattern.compile("[a-z]{3,}@[a-z]{5,}.[a-z]{3,}$");
		Matcher match1=pattern.matcher("abc@yahoo.com");
		Matcher match2=pattern.matcher("tejeswar@yahoo.com");
		boolean email1=match1.matches();
		System.out.println("UC1 Email1: "+email1);
		boolean email2=match2.matches();
		System.out.println("UC1 Email2: "+email2);

		//UC2
		Pattern patternUC2=Pattern.compile("[a-z]{3,}(-{1})[0-9]{1,}@[a-z]{5,}.[a-z]{3,}");
		Matcher matchUC2=patternUC2.matcher("abc-100@yahoo.com");
		boolean emailUC2=matchUC2.matches();
		System.out.println("UC2 Email1: "+emailUC2);

		Matcher matchUC22=patternUC2.matcher("tejeswar-12782@yahoo.com");
		boolean emailUC22=matchUC22.matches();
		System.out.println("UC2 Email2: "+emailUC22);
		
		
		//UC3 
		Pattern patternUC3=Pattern.compile("[a-z]{3,}(.{1}[0-9]{1,})@[a-z]{5,}.[a-z]{3,}");
		Matcher matchUC3=patternUC3.matcher("abc.123@gmail.com");
		boolean emailUC3=matchUC3.matches();
		System.out.println("UC3 Email1: "+emailUC3);
		Matcher matchUC33=patternUC3.matcher("tejeswar.3839@gmail.com");
		boolean emailUC33=matchUC33.matches();
		System.out.println("UC3 Email2: "+emailUC33);
		
		
	}
}
