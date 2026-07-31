import java.util.*;
public class main
{
	public static void main(String args[]) 
	{
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
 
    	while(t-- > 0)
    	{
    		int l = sc.nextInt();
    		int r = sc.nextInt();
    		int a = sc.nextInt();
 
    		int ans = 0, m = 0;
    		ans = (r/a) + (r%a);
    		m = r/a*a-1;

            // Check if m is within the range [l, r]
    		if(m >= l)
    			ans = Math.max(ans, (m/a)+(m%a));
 
    		System.out.println(ans);
		}
	}
}