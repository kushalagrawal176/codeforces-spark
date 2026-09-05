import java.util.*;
public class main
{
	public static long gcd(long a, long b) 
    {
		if(b == 0) 
            return a;

		return gcd(b,a%b);
	}
 
	public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
 
		while(t-- > 0)
        {
		    long n = sc.nextLong();
			long arr[] = new long[(int)n];
 
			long sum = 0, num = 0;
			long max = Long.MIN_VALUE;
 
			for(int i=0; i<n; i++) 
            {
				arr[i] = sc.nextLong();
				sum += arr[i];
			}
 
            for(int i=0; i<n-1; i++) 
            {
				num += arr[i];
				max = Math.max(max, gcd(sum-num,num));
			}
            
            System.out.println(max);
		}
    }
} 