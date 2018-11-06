import java.util.Scanner;

public class LoopDemo 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number, total = 1;
		System.out.print("Enter a nonnegative integer: ");
		number = keyboard.nextInt();
		
		while(number > 0)
		{
			total = total * number;
			number = number - 1;
		}
	}
}
