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
			int k = sc.nextInt();
			
			int arr[] = new int[n];
			int x[] = new int[n+1];
 
			for(int i=0;i<n;i++) 
			{
				arr[i] = sc.nextInt();
				x[arr[i]]++;
			}
 
			boolean b = true;
			for(int i=1;i<=n;i++) 
			{
				if(x[i]%k != 0)
				{
					b = false;
					break;
				}
 
				x[i] = x[i]/k;
			}
 
			if(!b) 
			{
				System.out.println(0);
				continue;
			}
 
			int i = 0;
			int j = 0;
 
			int f[] = new int[n+1];
			long ans = 0;
 
			while(j < n) 
			{
				int el = arr[j];
				f[el]++;
				
				while(f[el] > x[el]) 
				{
					f[arr[i]]--;
					i++;
				}
 
				ans += j-i+1;
				j++;
			}
			
			System.out.println(ans);
		}
	}
}