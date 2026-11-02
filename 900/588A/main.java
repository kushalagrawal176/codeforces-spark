import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
 
		int totalCost = 0;
		int minPrice = Integer.MAX_VALUE;
 
		for(int i=0;i<n;i++) 
        {
			int a = sc.nextInt();
			int p = sc.nextInt();
 
            minPrice = Math.min(minPrice,p);
			totalCost += a*minPrice;
		}
 
		System.out.println(totalCost);
	}
}