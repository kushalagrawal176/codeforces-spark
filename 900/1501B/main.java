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
    		int a[] = new int[n];
      
    		for(int j=0;j<n;j++)
    			a[j] = sc.nextInt();
    
    		int point = 0;
    		for(int p=n-1;p>=0;p--) 
            {
    			if(point < a[p]) 
                    point = a[p];
    			if(point != 0) 
                {
    				point -= 1;
                    a[p] = 1;
    			}
    		}
 
    		for(int i=0;i<n;i++) 
                System.out.print(a[i] + " ");
    		System.out.println();
    	}
    }
}