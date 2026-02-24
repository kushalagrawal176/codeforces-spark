import java.util.*;
public class main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while (t-- > 0)
		{
			int n = sc.nextInt();
			long[] a = new long[n];
			
			for (int i = 0; i < n; i++)
				a[i] = sc.nextLong();
		
			int[] b = new int[n];
			for (int i = 0; i < n; i++)
				b[i] = sc.nextInt();
 
			Arrays.sort(a);
			long max = 0;
			int used = 0;
 
			for (int i = 0; i < n; i++) 
			{
				used += b[i];
				
				if (used > n)
					break;
					
				long diff = a[n - used];
				long score = diff * (i + 1);
				
				if (score > max)
					max = score;
			}
			
			System.out.println(max);
		}
	}
}