import java.util.*;
 
public class main
{
	public static void main (String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        
		while(t-- > 0)
		{
            int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[][] ans = new int[n][2];
		    
		    for(int i=0;i<n;i++)
		    {
		        int x = sc.nextInt();
		        if(x%k == 0)
		            ans[i][0] = k;
		        else
		            ans[i][0] = x%k;

		        ans[i][1] = i+1;
		    }
 
            Arrays.sort(ans, (a, b) -> Integer.compare(b[0], a[0]));
		    
		    for(int i=0;i<n;i++)
                System.out.print(ans[i][1]+" ");
            System.out.println();
		}
	}
}