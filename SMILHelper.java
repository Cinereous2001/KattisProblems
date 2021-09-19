import java.util.Scanner;
public class SMILHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		char ch;
		for (int i = 0; i < line.length(); i++)
		{
			ch = line.charAt(i);
			if (ch == ':' && i < line.length() - 1)
			{
				if (line.charAt(i + 1) == ')')
				{
					System.out.println(i);
				}
				else if (line.charAt(i + 1) == '-')
				{
					if (line.charAt(i + 2) == ')')
						System.out.println(i);
				}
			}
			else if (ch == ';')
			{
				if (line.charAt(i + 1) == ')')
				{
					System.out.println(i);
				}
				else if (line.charAt(i + 1) == '-')
				{
					if (line.charAt(i + 2) == ')')
						System.out.println(i);
				}
			}
		}
	}

}
