package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Smallest_Digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		int rem=0;
		int small=9;
		while(num>0)
		{
			rem=num%10;
			if(rem<small)
			{
				small=rem;
			}
			num/=10;
		}
		System.out.println(small);
		sc.close();
	}
}
