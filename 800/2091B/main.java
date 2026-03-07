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
			long x = sc.nextLong();
			Long arr[] = new Long[n];
 
			for (int i=0;i<n;i++)
				arr[i] = sc.nextLong();
 
			Arrays.sort(arr, Collections.reverseOrder());
 
			int ans = 0;
			int j = 0;
 
			for (int i=0;i<n;i++) 
			{
				j++;
				if (arr[i]*j >= x) 
				{
					ans++;
					j = 0;
				}
			}
 
			System.out.println(ans);
		}
	}
}