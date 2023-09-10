package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Reverse_Number 
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
			sum=(sum*10)+rem;
			num/=10;
		}
		System.out.print("Reversed number = "+sum);
		sc.close();
	}
}
