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
			long k = sc.nextLong();
 
			long arr[] = new long[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
 
			long sum = 0;
			long ans = 0;
 
			for(int i=0;i<63;i++) 
			{
				PriorityQueue<Long> pq = new PriorityQueue<>();
				long num = (long)1<<i;
				
				for(int j=0;j<n;j++) 
				{
					long a = arr[j];
					if((num&a) > 0) 
						ans++;
					else
						pq.add(num);
				}
 
				while(!pq.isEmpty() && k >= pq.peek())
				{
					long a = pq.poll();
					ans += 1;
					k -= a;
				}
			}
 
			System.out.println(ans);
		}
	}
	
}