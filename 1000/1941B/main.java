import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
		   int n = sc.nextInt();
		   int[] a = new int[n];
		   
		   for(int i=0;i<n;i++)
		       a[i] = sc.nextInt();
		   
		   int count = 0;
		   for(int i=0;i<(n-2);i++)
		   {
		       int num = a[i];
		       if(a[i+1] >= (2*num) && a[i+2] >= a[i])
		       {
		           a[i] = 0;
		           a[i+1] = a[i+1] - 2*num;
		           a[i+2] = a[i+2] - num;
		           count++;
		       }
		       else
		           break;
		   }
		   
		   if(count == (n-2) && a[n-1] == 0 && a[n-2] == 0)
		       System.out.println("YES");
		   else
		       System.out.println("NO");
		}
	}
}