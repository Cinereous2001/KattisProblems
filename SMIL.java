//import java.util.ArrayList;
import java.util.Scanner;
public class SMIL 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		in.useDelimiter("");
		int count = 0;
		int[]  pos = new int[1];
		int i = 0;
		while (in.hasNext())
		{
			System.out.println("Help");
			char ch = in.next().charAt(0);
			if (ch == ':')
			{
				ch = in.next().charAt(0);
				count++;
				if (ch == ')')
				{
					pos[i] = count - 1;
					System.out.println(pos[i]);
					i++;
				}
				
				else if (ch == '-')
				{
					ch = in.next().charAt(0);
					if (ch == ')')
					{
						pos[i] = count - 1;
						System.out.println(pos[i]);
						i++;
						count = count + 1;
					}
				}
			}
			count++;	
		}  //end while
		
		//for (int j = 0; j < pos.length; j++);
		//{
			System.out.println("GO");
		//}
	}	//main
}
