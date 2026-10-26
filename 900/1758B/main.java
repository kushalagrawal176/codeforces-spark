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
	        if(n%2 == 0)
            {
	            n -= 2;
	            System.out.print("1 3 ");
	        }
 
	        while(n-- > 0)
	            System.out.print("2 ");
 
	        System.out.println();
	    }
	}
}