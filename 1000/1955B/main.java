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
            int c = sc.nextInt();
            int d = sc.nextInt();
 
            int b[] = new int[n*n];
            for(int i=0; i<n*n; i++) 
            	b[i] = sc.nextInt();
 
        	Arrays.sort(b);
        	int a[] = new int[n*n];
        	a[0] = b[0];
 
        	for(int i=1;i<n*n;i++)
        	{
        		if(i%n!=0)
        			a[i] = a[i-1]+d;
        		else
        			a[i] = a[i-n]+c;
        	}
 
        	Arrays.sort(a);
        	boolean flag = true;
 
        	for(int i=1;i<n*n;i++)
        	{
        		if(a[i] != b[i]) 
        		{
        			flag = false;
        			break;
        		}
        	}
        	
        	System.out.println(flag == true ? "YES" : "NO");
        }
    }
}