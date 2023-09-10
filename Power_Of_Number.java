package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Power_Of_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base = ");
		int base=sc.nextInt();
		System.out.print("Enter the Power = ");
		int exponent=sc.nextInt();
		int power=1;
		if(exponent==0)
		{
			power=1;
		}
		else
		{
			for(int i=1;i<=exponent;i++)
			{
				power=power*base;
			}
		}
		System.out.println("Power of a Number = "+power);
		sc.close();
	}
}
