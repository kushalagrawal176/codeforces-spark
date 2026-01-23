import java.util.*;
public class main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int a[] = new int[(int) n];
		
		long max = -1;
        long min = 1000000000;
		
		for(int i=0;i<n;i++) 
		{
			a[i] = sc.nextInt();
			min = Math.min(a[i], min);
			max = Math.max(a[i], max);
		}
		
		long x = 0;
        long y = 0;
		
		for(int i=0;i<n;i++) 
		{
			if(a[i] == max)
			    x++;
			if(a[i] == min)
			    y++;
		}
		
		if(max == min)
		    System.out.println(max-min+" "+(n*(n-1))/2);
		else 
		    System.out.println(max-min+" "+x*y);
	}
}