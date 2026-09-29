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
    		
    		int i = 1;
    		int j = n;
    
    		while(i <= j) 
            {
    			int x = 0;
 
    			while(x < k-1 && j >= i) 
                {
                    System.out.print(j-- +" ");
                    x++;
    			}
    
    			if(i <= j)
        			System.out.print(i++ +" ");
    		}
    
    		System.out.print("\n");
    	}
    }
}