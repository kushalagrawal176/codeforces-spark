import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		int a[] = new int[n];
		int totalSum = 0;
 
		for(int i=0;i<n;i++) 
        {
			a[i] = sc.nextInt();
			totalSum += a[i];
		}
 
		int count = 0;
		for(int i=0;i<n;i++) 
        {
			if(totalSum%2 == a[i]%2)
				count++;
		}
 
		System.out.println(count);
	}
}