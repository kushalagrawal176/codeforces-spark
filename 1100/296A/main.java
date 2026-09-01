import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		int a[] = new int[1001];
		for(int i = 0; i<n; i++)
		    a[sc.nextInt()]++;
 
		Arrays.sort(a);
 
		System.out.println((a[1000] <= (n+1)/2) ? "YES" : "NO");
	}
}