import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
		    long n = sc.nextLong();
 
		    long d = 10;
		    long c = 0;
 
		    List<Long> arr = new ArrayList<>();
 
		    while(n/(d+1) > 0)
		    {
		        if(n%(d+1) == 0)
		        {
		            c++;
		            arr.add(0, n/(d+1));
		        }
 
		        d*=10;
		    }
 
		    System.out.println(c);
 
		    for(long x:arr)
		        System.out.print(x + " ");
 
		    if(c > 0) 
		        System.out.println();
		}
	}
}