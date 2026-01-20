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
			int arr[] = new int[101];
			
			for(int i=0;i<n;i++)
				arr[sc.nextInt()]++;
			
			int max=0;
			for(int i=0;i<=100;i++)
			{
				int cur=0;
				for(int j=0;j<=i;j++)
					cur+=Math.min(arr[j], arr[i-j]);
				
				max=Math.max(cur, max);
			}
			
			System.out.println(max/2);
		}
	}
 
}