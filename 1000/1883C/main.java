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
        	
        	int res = Integer.MAX_VALUE;
        	int evenCount = 0;
        	
        	for(int i=0;i<n;i++) 
        	{
        		int val = sc.nextInt();
        		
        		if(val%2 == 0)
        		    evenCount++;
        		    
        		int cur = (val%k == 0)? 0 : k-(val%k);
        		res = Math.min(res, cur);
        	}
        	if(k == 4)
        		res = Math.min(res, Math.max(0, 2 - evenCount));
    
        	System.out.println(res);
    	}
    }
}