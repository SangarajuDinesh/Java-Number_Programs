package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class ArmstrongNumber 
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
			sum+=(rem*rem*rem);
			num/=10;
		}
		if(sum==temp)
		{
			System.out.print("Armstrong number");
		}
		else
		{
			System.out.print("Not an Armstrong number");
		}
		sc.close();
	}
}
