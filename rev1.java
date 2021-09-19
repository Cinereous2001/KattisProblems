import java.util.Scanner;
public class rev1 {

	public static void main(String[] args) {
		System.out.println(clean("Hello, there. I am.;' a good guy..."));
		

	}
	
	public static String clean(String word)
	{
		Scanner in = new Scanner(word);
		in.useDelimiter("[^A-Za-z]+");
		String finalString = "";
		String str;
		while (in.hasNext())
		{
			str = in.next();
			str.trim();
			finalString = finalString + str;	
		}			
		return finalString.toUpperCase();
	}
	

}
