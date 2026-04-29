import java.util.*;
public class main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	
		while(t-- > 0) 
		{
			int n = sc.nextInt();
			long[] a = new long[n];
 
			for(int i=0;i<n;i++)
			    a[i] = sc.nextInt();
 
			long res = 0;
			for(int i=1;i<n-1;i+=2) 
			{
				if(a[i] >= a[i-1] + a[i+1])
				    continue;
 
				long diff = (a[i-1]+a[i+1])-a[i];
 
				if(a[i+1] >= diff)
					a[i+1] -= diff;
				else 
				{
					long temp = diff-a[i+1];
					a[i+1] = 0;
					a[i-1] -= temp;
				}
 
				res += diff;
			}
 
			res += (n%2==0 && a[n-1]<a[n-2])? a[n-2]-a[n-1] : 0;
			System.out.println(res);
		}
	}
}