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
			int x = sc.nextInt();
			
			int freq[] = new int[n+1];
			for(int i=0;i<n;i++)
			{
				int a = sc.nextInt();
				if(a <= n)
					freq[a]++;
			}
			
			int ans = 0;
			for(;ans<=n;ans++)
			{
				if(freq[ans] == 0)
					break;
					
				int extra = freq[ans]-1;
				if(ans+x <= n)
					freq[ans+x] += extra;
			}
			
			System.out.println(ans);
		}
	}
}