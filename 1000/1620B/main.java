import java.util.*;
public class main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
			long w = sc.nextLong();
			long h = sc.nextLong();
 
			long max = 0;
			for (int i = 0; i < 4; i++) 
			{
				int q = sc.nextInt();
				int a[] = new int[q];
 
				for(int j=0;j<q;j++)
					a[j] = sc.nextInt();
 
				max = Math.max(max, ((a[q-1]-a[0])*((i < 2) ? h : w)));
			}
 
			System.out.println(max);
		}
	}
}