import java.util.*;
public class main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
			long n = sc.nextLong();
			long k = sc.nextLong();
			long b = sc.nextLong();
			long s = sc.nextLong();
 
			if(s < b*k || s > (k*b+(k-1)*n))
			{
			    System.out.println(-1);
			    continue;
			}
 
			long sum = 0;
		    long arr[] = new long[(int)n];
 
		    sum = s-b*k;
		    arr[0] = b*k;
			
			for(int i=0;i<n && sum>0;i++)
			{
				long add = Math.min(sum, k-1);
				arr[i] += add;
				sum -= add;
			}
 
			for(int i=0;i<n;i++)
			    System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
}