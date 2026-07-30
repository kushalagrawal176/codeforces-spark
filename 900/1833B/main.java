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
			int k = sc.nextInt();
 
			int a[][] = new int[n][2];
			int b[] = new int[n];
			int ans[] = new int[n];
 
			for(int i=0; i<n; i++) 
			{
				a[i][0] = sc.nextInt();
				a[i][1] = i;
			}
 
			for(int i=0; i<n; i++)
				b[i] = sc.nextInt();
 
			Arrays.sort(a, (a1, b1) -> Integer.compare(a1[0],b1[0])); 
			Arrays.sort(b);
 
			for(int i=0; i<n; i++)
			    ans[a[i][1]] = b[i];
 
			for(int i=0; i<n; i++)
				System.out.print(ans[i] + " ");
			System.out.println();
		}
	}
}