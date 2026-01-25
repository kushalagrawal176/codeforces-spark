import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int t = sc.nextInt();
	    
	    int a[] = new int[n];
	    
	    for(int i=0;i<n;i++)
	        a[i] = sc.nextInt();
	       
	    int ans = 0;
	    int sum = 0;
	    int j = 0;
	    
	    for(int i=0;i<n;i++)
	    {
	        sum = sum + a[i];
            while(sum > t)
            {
                sum = sum - a[j];
                j++;
            }
	        if(ans < i-j+1)
	            ans = i-j+1;
	    }
	    
	    System.out.println(ans);
    }
}