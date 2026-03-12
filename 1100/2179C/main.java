import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i=0;i<n;i++) 
		        a[i] = sc.nextInt();
		        
		    Arrays.sort(a);
		    
		    System.out.println(Math.max(a[0], a[1]-a[0]));
		}
	}
}