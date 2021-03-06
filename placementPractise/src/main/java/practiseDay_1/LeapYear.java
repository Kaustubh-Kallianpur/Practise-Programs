package practiseDay_1;

import java.util.Scanner;

public class LeapYear 
{
	static int year;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter a year: ");
		year = sc.nextInt();
	}
	
	public void calculate()
	{
		if(year>0)
		{	
			if(year%4 == 0)
				System.out.println(year+" is a LEAP YEAR");
			else
				System.out.println(year+" is not a LEAP YEAR");
		}
		else
		{
			System.out.println("INVALID INPUT. ENTER POSITIVE NUMBER ONLY");
		}
	}
	
	public static void main(String[] args) 
	{
		LeapYear lp = new LeapYear();
		lp.input();
		lp.calculate();
	}
}