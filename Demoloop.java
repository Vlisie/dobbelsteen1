package demo;

import java.util.Random;

public class Demoloop 
{
	public static void main(String[] args)
	{
		int totalcount = 0;
		Random rand = new Random();
		for (int i = 1 ; i <= 20 ; i++)
		{
			int n = rand.nextInt(6) + 1;
			System.out.println(n);
			if (n == 1);
				totalcount++;
		}		
		
		System.out.println("Hoevaak is er 1 gegooid:" + totalcount);
		System.out.println("============");
		System.out.println("Toevallig klaar.");
	}
}
