package practiseDay_1;

import java.util.Scanner;

public class CompositeNumber 
{
	int num;
	int flag=0;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter a number to check COMPOSITE: ");
		num = sc.nextInt();
	}
	
	public void process()
	{
		if(num<1)
		{
			flag = -1;
			System.out.println("INVALID INPUT. ENTER A POSITIVE NUMBER");
		}
		if(num==0 || num==1)
		{
			System.out.println("NEITHER PRIME NOR COMPOSITE");
		}
		else
		{
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 1)
				System.out.println(num+" is COMPOSITE");
			if(flag == 0)
				System.out.println(num+" is NOT COMPOSITE. It is a PRIME");
		}
	}
	
	
	public static void main(String[] args) 
	{
		CompositeNumber p = new CompositeNumber();
		p.input();
		p.process();
	}
}
