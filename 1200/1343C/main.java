import java.util.*;
 
public class main 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0)
		{
    		int n =sc.nextInt();
    		
    		long a = sc.nextInt();
    		long b = a*(-1), ans=0;
     
    		for(int i=1; i<n; i++)
    		{
    			long temp = sc.nextInt();
    			b = temp;
    			
    			if (temp*a > 0)
    				a = Math.max(a, temp);
    			else 
    			{
    				ans += a;
    				a = b;
    			}
    		}
    		ans += a;
            
    		System.out.println(ans);
	    }
	}
}