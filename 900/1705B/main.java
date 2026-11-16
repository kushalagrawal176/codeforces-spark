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
	        long sum = 0;
 
	        for(int i=0;i<n;i++)
            {
	            int a = sc.nextInt();
 
	            if(i < n-1)
                {
	                sum += a;
	                if(a == 0 && sum != 0) 
                        sum++;
	            }
	        }
 
	        System.out.println(sum);
	    }
	}
}
