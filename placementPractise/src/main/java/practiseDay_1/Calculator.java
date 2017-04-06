package practiseDay_1;

import java.util.Scanner;

public class Calculator 
{
	
	static int a, b, flag=0, calc=0;
	static char x;
	static 
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		
		System.out.print("Enter the operation to perform: ie( +, -, /, *, %) ONLY: " );
		x = sc.next().charAt(0);
	}
	
	public int calculate(int a, int b)
	{
		switch (x)
		{
		case '+':	return a+b;
		case '-':	return a-b;
		case '*':	return a*b;
		case '/':	return a/b;
		case '%':	return a%b;

		default:	flag=1;
					return 0;
		}
	}
	
	public static void main(String[] args) 
	{
		Calculator cc = new Calculator();
		cc.input();
		int value = cc.calculate(a, b);
		if(flag==0)
		{
			System.out.println("Output -");
			System.out.println(a+" "+x+" "+b+" = "+value);
		}
		else
		{
			System.out.println("INVALID OPERATOR");
		}
	}
}	