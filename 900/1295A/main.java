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
		    String s = "";
 
		    if(n%2 == 1)
            {
		        s = "7";
		        n = n-3;
		    }
 
		    String s2 = "1";
		    System.out.println(s+s2.repeat(n/2));
		}
	}
}