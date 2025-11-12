import java.util.*;
 
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long sumA = 0, sumB = 0, sumC = 0;
		
		for (int i = 0; i < n; i++) 
		    sumA += sc.nextLong();
		for (int i = 0; i < n - 1; i++) 
		    sumB += sc.nextLong();
		    
		System.out.println(sumA - sumB);
		
		for (int i = 0; i < n - 2; i++) 
		    sumC += sc.nextLong();
		    
		System.out.println(sumB - sumC);
	}
}