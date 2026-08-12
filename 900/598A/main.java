import java.util.*;
public class main
{
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
        {
			long n = sc.nextLong();
			long sum = (n*(n+1))/2;
 
			for(int i=1;i<=n;i*=2) 
                sum -= 2*i;
 
			System.out.println(sum);
		}
	}
 
}