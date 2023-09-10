package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Sum_Of_Digits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.print("Sum of the Digits = "+sum);
		sc.close();
	}
}
