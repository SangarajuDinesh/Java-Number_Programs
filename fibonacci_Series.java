package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class fibonacci_Series 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num=sc.nextInt();
		fibonacci(num);
		sc.close();
	}

	private static void fibonacci(int num) 
	{
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int sum=0;
		while(num>=0)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			num--;
		}
	}
}
