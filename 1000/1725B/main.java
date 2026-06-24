import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
		int d = sc.nextInt();
 
		int p[] = new int[n];
		for(int i=0; i<n; i++) 
		    p[i] = sc.nextInt();
 
		Arrays.sort(p);
 
		int k = 0, count = 0;
		for(int i=n-1; i>=k; i--)
		{
		    if(p[i] > d) 
		        count++;
		    else 
		    {
                k += d/p[i];
		        if(k <= i) 
		            count++;
		    }
		}
 
	    System.out.println(count);
    }
}