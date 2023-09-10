import java.util.Scanner;

public class Swapping 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers :");
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swapped Numbers :"+num1+" "+num2);
		sc.close();
	}

}
