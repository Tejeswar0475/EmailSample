package com.javaprogram.email;

import java.util.regex.*;

public class EmailSample {

	public static void main(String[] args)
	{
		//UC1
		System.out.println("Welcome to Email Samples");
		Pattern pattern=Pattern.compile("[a-zA-Z]{3,}@[a-z]{5,}.[a-z]{3,}$");
		Matcher match1=pattern.matcher("abc@yahoo.com");
		Matcher match2=pattern.matcher("tejeswar@yahoo.com");
		boolean email1=match1.matches();
		System.out.println("UC1 Email1: "+email1);
		boolean email2=match2.matches();
		System.out.println("UC1 Email2: "+email2);

		//UC2
		Pattern patternUC2=Pattern.compile("[a-zA-Z]{3,}(-{1})[0-9]{1,}@[a-z]{5,}.[a-z]{3,}");
		Matcher matchUC2=patternUC2.matcher("abc-100@yahoo.com");
		boolean emailUC2=matchUC2.matches();
		System.out.println("UC2 Email1: "+emailUC2);

		Matcher matchUC22=patternUC2.matcher("tejeswar-12782@yahoo.com");
		boolean emailUC22=matchUC22.matches();
		System.out.println("UC2 Email2: "+emailUC22);

		//UC3
		Pattern patternUC3=Pattern.compile("[a-zA-Z]{3,}(.{1}[0-9]{1,})@[a-z]{5,}.[a-z]{3,}");
		Matcher matchUC3=patternUC3.matcher("abc.123@gmail.com");
		boolean emailUC3=matchUC3.matches();
		System.out.println("UC3 Email1: "+emailUC3);
		Matcher matchUC33=patternUC3.matcher("tejeswar.3839@gmail.com");
		boolean emailUC33=matchUC33.matches();
		System.out.println("UC3 Email2: "+emailUC33);

		//UC4
		Pattern patternUC4=Pattern.compile("([A-Za-z0-9]){3,}@[a-z]{5,}.[a-z]{2,}");
		Matcher matchUC4=patternUC4.matcher("abc111@gmail.com");
		boolean emailUC4=matchUC4.matches();
		System.out.println("UC4 Email1: "+emailUC4);
		Matcher matchUC44=patternUC4.matcher("Tejeswar121@yahoo.com");
		boolean emailUC44=matchUC44.matches();
		System.out.println("UC4 Email2: "+emailUC44);

		//UC5
		Pattern patternUC5=Pattern.compile("[a-zA-Z]{3,}(-{1})[0-9]{1,}@[a-z]{5,}.[a-z]{3,}");
		Matcher matchUC5=patternUC5.matcher("abc-100@abc.net");
		boolean emailUC5=matchUC5.matches();
		System.out.println("UC5 Email1: "+emailUC4);
		Matcher matchUC55=patternUC5.matcher("tejeswar-211@yahoo.net");
		boolean emailUC55=matchUC55.matches();
		System.out.println("UC5 Email2: "+emailUC55);

		//UC6
		Pattern patternUC6=Pattern.compile("[a-zA-Z]{3,}(.{1}[0-9]{1,})@[a-z]{3,}.[a-z]{3,}.[a-z]{2,}");
		Matcher matchUC6=patternUC6.matcher("abc.100@abc.com.au");
		boolean emailUC6=matchUC6.matches();
		System.out.println("UC6 Email1: "+emailUC6);
		Matcher matchUC66=patternUC6.matcher("vTejeswar.221@gmail.com.in");
		boolean emailUC66=matchUC66.matches();
		System.out.println("UC6 Email2: "+emailUC66);

		//UC7
		Pattern patternUC7=Pattern.compile("[a-zA-Z]{3,}@[a-z0-9]{1,}.[a-z]{3,}");
		Matcher matchUC7=patternUC7.matcher("abc@1.com");
		boolean emailUC7=matchUC7.matches();
		System.out.println("UC7 Email1: "+emailUC7);
		Matcher matchUC77=patternUC7.matcher("tejeswar@322.com");
		boolean emailUC77=matchUC77.matches();
		System.out.println("UC7 Email2: "+emailUC77);


	}
}
