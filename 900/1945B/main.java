import java.util.*;
public class main
{
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
        {
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long m = sc.nextLong();
 
		    System.out.println((m/a) + (m/b) + 2);
		}
	}
}