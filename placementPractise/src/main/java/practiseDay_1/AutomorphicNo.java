package practiseDay_1;

import java.util.Scanner;

public class AutomorphicNo
{
	public static void main(String[] args) 
	{
		Integer n;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER TO CHECK IF IT IS AUTOMORPHIC");
		n = sc.nextInt();
		sc.close();
		Integer sq = n*n;
		
		String num = Integer.toString(n);
		String square = Integer.toString(sq);
		if(square.endsWith(num))	
			System.out.println(num+" IS AUTOMORPHIC...");
		else
			System.out.println(num+" IS NOT AUTOMORPHIC...");	
	}
}
