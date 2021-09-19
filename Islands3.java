import java.util.Arrays;
import java.util.Scanner;
public class Islands3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int islandCount = 0;
		int rD = 0;
		int cR = 0;
		int cL = 0;
		int rU = 0;
		char[][] island = new char[r +2][c + 2];
		in.useDelimiter("");
		for (int i = 1; i < r; i++)
		{
			for (int j = 1; j < c; j++)
			{
				island[i][j] = in.next().charAt(0);
			}
		}
		System.out.println(Arrays.deepToString(island));
		for (int i = 1; i < r; i++)
		{
			for (int j = 1; j < c; j++)
			{
				if (island[r][c] == 'L')
				{
					island[r][c] = ' ';
						do {
							rD = downSearch(r, c, island);
						} while (island[rD][c] == 'L');
						do {
							cR = rightSearch(r, c, island);
						} while (island[r][cR] == 'L');
						do {
							cL = leftSearch(r, c, island);
						} while (island[r][cL] == 'L');
						do {
							rU = rightSearch(r, c, island);
						} while (island[rU][c] == 'L');
						
				islandCount += 1;	
				}
			}
		}
	    System.out.println(islandCount);

	}
	
	public static void findL(int r, int c, char[][] island)
	{
		if (island[r][c] == 'L')
		{
			island[r][c] = ' ';
		}
		if (island[r][c] == 'C')
		{
			island[r][c] = ' ';
		}
	}
	
	public static int downSearch(int r, int c, char[][] island)
	{
		if (island[r + 1][c] == 'L')
		{
			island[r + 1][c] = ' ';
			r = r + 1;
		}
		return r;
	}
	
	public static int upSearch(int r, int c, char[][] island)
	{
		if (island[r - 1][c] == 'L')
		{
			island[r - 1][c] = ' ';
			r = r - 1;
		}
		return r;
	}
	
	public static int rightSearch(int r, int c, char[][] island)
	{
		if (island[r][c + 1] == 'L')
		{
			island[r][c + 1] = ' ';
			c = c + 1;
		}
		return c;
	}
	
	public static int leftSearch(int r, int c, char[][] island)
	{
		if (island[r][c - 1] == 'L')
		{
			island[r][c - 1] = ' ';
			c = c - 1;
		}
		return c;
	}

	
	/*
	 * LWLL
	 * WLWL
	 * LLLL
	 */
}
