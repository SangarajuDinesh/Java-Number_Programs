package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Largest_Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		int rem=0;
		int large=0;
		while(num>0)
		{
			rem=num%10;
			if(rem>large)
			{
				large=rem;
			}
			num/=10;
		}
		System.out.println(large);
		sc.close();
	}
}
