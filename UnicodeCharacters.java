import java.util.Scanner;

public class UnicodeCharacters 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.nextLine();
		int len=name.length();
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+(int)(name.charAt(i));
		}
		System.out.println(sum);
		sc.close();
	}
}
