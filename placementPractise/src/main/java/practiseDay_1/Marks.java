package practiseDay_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marks 
{
	List<Integer> a = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		int i;
		for(i=0; i<6; i++)
		{	
			System.out.print("Enter marks of subject "+(i+1)+" : ");
			a.add(sc.nextInt());
		}
	}
	
	public void calculate()
	{
		int total = 0, i;
		float average = 0;
			for(i=0; i<6; i++)
			{
				total = total + a.get(i);
			}
			
		average = total/6;
		System.out.println("TOTAL OF 6 SUBJECTS = "+total);
		System.out.println("AVERAGE OF ALL SUBJECTS = "+average);
	}
	
	public static void main(String[] args) 
	{
		Marks mc = new Marks();
		mc.input();
		mc.calculate();
	}
}
