import java.util.Scanner;
public class Echo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String word = in.next();
		for (int i = 0; i < 3; i++)
		{
			if (i < 2)
				
			System.out.print(word + " ");
			else
				System.out.println(word);
			
		}
		
		

	}

}
