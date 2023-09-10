import java.util.Scanner;

public class PronicNumbersInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int x=0,y=0,pro=0;;
		for(int i=0;i<=num;i++)
		{
			x=i;
			y=i+1;
			pro=x*y;
			int temp=x;
			x=y;
			y=temp;
			System.out.print(pro+" ");
		}
		sc.close();
	}
}
