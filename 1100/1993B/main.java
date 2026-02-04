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
		    int a[] = new int[n];
		    
		    long max_odd = Long.MIN_VALUE;
		    int odd = 0;
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		        if(a[i]%2 != 0)
		        {
		            max_odd = Math.max(max_odd, a[i]);
		            odd++;
		        }
		    }
		    
		    if(max_odd == Long.MIN_VALUE || odd == n)
		        System.out.println(0);
		    else
		    {
    		    Arrays.sort(a);
    		    int count = 0, temp = 0;
    		    for(int i=0;i<n;i++)
    		    {
    		        if(a[i]%2 == 0)
    		        {
    		            if(a[i] > max_odd)
    		                temp = 1;
 
    		            max_odd += a[i];
    		            count++;
    		        }
		        }
		        
		        System.out.println(count+temp);
		    }
		}
	}
}