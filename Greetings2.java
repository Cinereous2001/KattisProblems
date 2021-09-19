import java.util.Scanner;

public class Greetings2 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String greeting = in.next();
		int length = greeting.length() - 2;
		greeting = greeting.substring(0, greeting.length() - 1);
		System.out.print(greeting);
		for (int i = 0; i < length; i++)
		{
			System.out.print("e");
		}
		System.out.println("y");
	 
		
		

	}

}
