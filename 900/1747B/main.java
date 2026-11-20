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
 
		    int right = 3*n;
		    int left = 1;
 
		    System.out.println((n+1)/2);
 
		    while(left <= right)
            {
		        System.out.println(left + " " + right);
 
		        left += 3;
		        right -= 3;
		    }
		}
	}
}