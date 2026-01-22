import java.util.*;
public class main
{
	static boolean isPrime(long n)
    {
		if(n<=1)
		    return false;
		    
		if(n==2||n==3)
		    return true;
		
		if(n%2==0||n%3==0)
		    return false;
		
		for(int i=5;i*i<=(int)n;i+=6)
		{
			if(n%i==0||n%(i+2)==0)
			    return false;
		}
		
		return true;
	}
    
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
		    long n=sc.nextLong();
		    
			long a=(long)(Math.sqrt(n));
			
            if(a*a==n&&isPrime(a))
			    System.out.println("YES");
			else
			    System.out.println("NO");
		}
	}
}