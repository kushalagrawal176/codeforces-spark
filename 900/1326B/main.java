import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		int a[] = new int[n];
		for(int i=0;i<n;i++) 
            a[i] = sc.nextInt();
 
		long max = 0;
		for(int i=0;i<n;i++)
        {
		    long temp = a[i] + max;
		    max = Math.max(max, temp);
 
		    System.out.print(temp + " ");
		}
	}
}
