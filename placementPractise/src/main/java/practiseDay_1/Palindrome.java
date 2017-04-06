package practiseDay_1;

import java.util.Scanner;

public class Palindrome 
{
	long n;
	
	public void input()
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		sc.close();
	}
	
	public void checkPalindrome()
	{
		long rem, rev = 0;
		long temp = n;
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		
		if(rev == n)
			System.out.println(+n+" is a PALINDROME");
		else
			System.out.println(+n+" is not a PALINDROME");
	}
	
	public static void main(String[] args) 
	{
		Palindrome pd = new Palindrome();
		pd.input();
		pd.checkPalindrome();
	}
}
