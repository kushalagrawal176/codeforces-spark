import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
        {
			int n = sc.nextInt();
 
			long a[] = new long[n];
			long b[] = new long[n];
 
			long sumA = 0;
			long minA = Long.MAX_VALUE;
 
			for(int i=0;i<n;i++) 
            {
				a[i] = sc.nextLong();
 
				sumA += a[i];
				minA = Math.min(minA, a[i]);
			}
 
			long sumB = 0;
			long minB = Long.MAX_VALUE;
 
			for(int i=0;i<n;i++) 
            {
				b[i] = sc.nextLong();
 
				sumB += b[i];
				minB = Math.min(minB, b[i]);
			}
 
			long option1 = sumA + (long)n*minB;
			long option2 = (long)n*minA + sumB;
			long ans = Math.min(option1, option2);
 
			System.out.println(ans);
		}
 
	}
}