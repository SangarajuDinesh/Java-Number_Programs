package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Spy_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		int rem=0,sum=0,pro=1;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		if(sum==pro)
		{
			System.out.println("Spy");
		}
		else
		{
			System.out.println("Not spy");
		}
		sc.close();
	}
}
