import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int sum=0;
		int temp=num;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(temp==sum)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a perfect Number");
		}
		sc.close();
	}
}
