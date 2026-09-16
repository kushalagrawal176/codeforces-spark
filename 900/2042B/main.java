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
 
		    int a[] = new int[n+1];
		    for(int i=0;i<n;i++)
            {
		        int x = sc.nextInt();
		        a[x]++;
		    }
		    
		    int p=0,q=0;
		    for(int i=1;i<=n;i++)
            {
		        if(a[i] == 1)
                    p++;
		        else if(a[i] > 1)
                    q++;
		    }
 
		    int ans = q+2*(p/2+p%2);
		    System.out.println(ans);
		}
 
	}
}