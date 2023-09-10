package com.kn.Number_Based_Programs;

import java.util.Scanner;

public class Prime_Numbers_In_Range 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the min Range = ");
		int min=sc.nextInt();
		System.out.println("Enter the Max Range = ");
		int max=sc.nextInt();
		for(int i=min;i<=max;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
