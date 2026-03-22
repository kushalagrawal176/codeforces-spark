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
	        int k = sc.nextInt();
	        
	        String s = sc.next();
	        
	        char res[] = new char[n];
	        for(int i=0;i<n;i++)
	            res[i] = '+';
 
	        int l = 0;
	        int r = n-1;
	        int either = 0;
	        
	        for(int i=0;i<k;i++)
	        {
	            if(s.charAt(i) == '0') 
	                l++;
	            else if(s.charAt(i) == '1') 
	                r--;
	            else 
	                either++;
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            if(i > r-either || i < l+either) 
	                res[i] = '?';
 
	            if(i < l || i > r || k == n) 
	                res[i] = '-';
	        }
	        
	        for(int i=0;i<n;i++)
	            System.out.print(res[i]);
                
	        System.out.println();
	    }
	}
}