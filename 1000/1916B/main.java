import java.util.*;
public class main
{
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        
        return gcd(b, a%b);
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long x = sc.nextLong();
		    long y = sc.nextLong();
 
		    long a = x, b = y;
		    while(b != 0)
		    {
		        long temp = a%b;
		        a = b;
		        b = temp;
		    }
 
		    long gcd = a;
		    long lcm = (x/gcd)*y;
 
		    if(y%x == 0) 
		        System.out.println(y*(y/x));
		    else 
		        System.out.println(lcm);
        }
    }
}