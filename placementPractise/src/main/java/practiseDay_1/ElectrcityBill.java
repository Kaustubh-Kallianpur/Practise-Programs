package practiseDay_1;

import java.util.Scanner;

public class ElectrcityBill 
{
	long c_number;
	float units;
	float total = 200;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.print("ENTER CONSUMER NUMBER: ");
		c_number = sc.nextLong();
		
		System.out.print("ENTER UNITS CONSUMED: ");
		units = sc.nextInt();
	}
	
	public void calculateBill()
	{
		if(units > 100)
		{
			if(units >= 300)
				total = total + 200;
			else
				total = total + ((units-100));
		}
		if(units > 300)
		{
			if(units >=500)
				total = total + 310;
			else
				total = (float) (total + ((units-300)*1.55));
		}
		if(units > 500)
		{
			total = total + ((units-500)*2);
		}
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("CONSUMER NUMBER IS: "+c_number);
		System.out.println("CONSUMER BILL = "+total);
	}
	
	public static void main(String[] args) 
	{	
		ElectrcityBill eb = new ElectrcityBill();
		eb.input();
		eb.calculateBill();
		eb.display();
	}
}