package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Harshad_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		int rem=0,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		if(temp%sum==0)
		{
			System.out.println("harshad");
		}
		else
		{
			System.out.println("Not a Harshad");
		}
		sc.close();
	}
}
