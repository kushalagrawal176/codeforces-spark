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
		    long k = sc.nextLong();
 
		    Set<Long> set = new HashSet<>();
		    long a[] = new long[n];
 
		    for(int i=0; i<n; i++) 
            {
		        a[i] = sc.nextLong();
		        set.add(a[i]);
		    }
 
		    boolean res = false;
		    for(int i=0; i<n; i++) 
            {
		        long x = a[i]-k;
		        if(set.contains(x)) 
                    res=true;
		    }
 
		    System.out.println(res ? "Yes":"No");
		}
	}
}