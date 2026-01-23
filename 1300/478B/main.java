import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		int m = sc.nextInt();
		
		long r = n%m;
		long d = n/m;
		long num = n-m+1;
		
		long min = (((d*(d-1))/2) *(m-r)+ ((d+1)*(d)/2)*(r));
		long max = (num*(num-1))/2;
		
		System.out.println(min+" "+max);
	}
}