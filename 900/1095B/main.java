import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int a[] = new int[n];
 
        for(int i=0; i<n; i++) 
            a[i] = sc.nextInt();
 
        Arrays.sort(a);
 
        System.out.println(Math.min(a[n-2]-a[0], a[n-1]-a[1]));
	}
}