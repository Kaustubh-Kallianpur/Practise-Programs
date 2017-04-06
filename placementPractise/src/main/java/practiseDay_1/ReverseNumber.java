package practiseDay_1;

import java.util.Scanner;

public class ReverseNumber 
{
	static int n;
	Scanner sc = new Scanner(System.in);
	
	public int input()
	{
		System.out.println("Enter a 4 digit number: ");
		n = sc.nextInt();
		return n;
	}
	
	public int reverse(int n)
	{
		int rem, rev = 0;
		int temp = n;
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		ReverseNumber rn = new ReverseNumber();
		int x = rn.input();
		int y = rn.reverse(x);
		System.out.println("Reverse of "+n+" is "+y);
	}
}
