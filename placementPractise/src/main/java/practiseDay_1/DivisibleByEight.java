package practiseDay_1;

public class DivisibleByEight 
{
	public static void main(String[] args) 
	{
		int i;
		int total = 0;
		for(i=101; i<200; i++)
		{
			if(i%8 == 0)
			{
				System.out.print(+i+"\t");
				total = total + i;
			}
		}
		System.out.println("\nTOTAL OF ALL DIVISBLE NUMBERS = "+total);
	}
}
