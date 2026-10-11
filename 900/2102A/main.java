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
    		int m = sc.nextInt();
    		int p = sc.nextInt();
    		int q = sc.nextInt();

    		if((n%p == 0) && ((n/p)*q != m))
    			System.out.print("NO\n");
    		else 
                System.out.print("YES\n");
    	}
    }
}