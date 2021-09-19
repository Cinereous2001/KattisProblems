import java.util.Scanner;

public class heartRate {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] b = new int[N];
		double[] p = new double[N];
		
		for (int i = 0; i < N; i++)
		{
			b[i] = in.nextInt();
			p[i] = in.nextDouble();
					//6 beats in 5 secs			
		}
		
		for (int i = 0; i < N; i++)
		{
			double actualABPM = (60 * b[i]) / p[i];
			double minABPM = (60 * (b[i] - 1)) / p[i];
			double maxABPM = (60 * (b[i] + 1)) / p[i];
			System.out.printf("%.4f %.4f %.4f\n", minABPM, actualABPM, maxABPM); 
		}

	}

}
