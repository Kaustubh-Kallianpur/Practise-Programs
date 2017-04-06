package practiseDay_1;

import java.util.Scanner;

public class VowelCheck 
{
	static char a;
	Scanner sc = new Scanner(System.in);
	
	public char input()
	{
		System.out.print("Enter a charectar: ");
		a = sc.next().charAt(0);
		return a;
	}
	
	public boolean isVowel(char a)
	{
		switch (a)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
			default:
				return false;
		}
	}
	
	public static void main(String[] args) 
	{
		VowelCheck vc = new VowelCheck();
		vc.input();
		boolean value = vc.isVowel(a);
		if(value)
			System.out.println((char)a+" is a VOWEL...");
		else
			System.out.println((char)a+" is a CONSONANT");
	}
}
