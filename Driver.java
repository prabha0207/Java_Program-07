import java.util.Scanner;
 
public class Driver
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = input.nextInt();
		System.out.println("Odd numbers in the range 1 - " + n + " are: ");
		for(int i = 1; i <= n; i = i + 2)
			System.out.print(i + " ");
		input.close();
	}
}
