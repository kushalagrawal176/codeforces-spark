import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int m = sc.nextInt();
 
		int arr[][] = new int[m][2];
 
		for(int i=0;i<m;i++)
        {
		    arr[i][0] = sc.nextInt();
		    arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr,(a,b)->Integer.compare(-a[1],-b[1]));
		int ans = 0;
 
		for(int i=0;i<m;i++)
        {
		    if(n <= 0)
		        break;
 
		    int min = Math.min(n, arr[i][0]);
		    n -= min;
		    ans += min*arr[i][1];
		}
 
		System.out.println(ans);
	}
}