package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Strong_Number 
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
			int fact=1;
			int i=1;
			while(rem>=i)
			{
				fact=fact*i;
				i++;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.print("Strong Number");
		}
		else
		{
			System.out.print("not a Strong Number");
		}
		sc.close();
	}
}
