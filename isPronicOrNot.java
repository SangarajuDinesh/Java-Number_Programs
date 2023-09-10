import java.util.Scanner;

public class isPronicOrNot 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			if(num==(i*(i+1)))
			{
				System.out.print("Pronic");
			}
		}
		sc.close();
	}
}
