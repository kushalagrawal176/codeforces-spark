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
            long ans = 0, amin = Integer.MAX_VALUE, bmin = Integer.MAX_VALUE;
		  
            while(n-- > 0)
            {
                int x = sc.nextInt();
                int a[] = new int[x];
                
                for(int i=0;i<x;i++)
                    a[i] = sc.nextInt();
                    
                Arrays.sort(a);
                ans += a[1];
                
                amin = Math.min(a[0], amin);
                bmin = Math.min(a[1], bmin);
            }
            
            System.out.println(ans-bmin+amin);
		}
	}
}