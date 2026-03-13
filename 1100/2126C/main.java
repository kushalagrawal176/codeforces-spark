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
		    int k = sc.nextInt();
 
		    int a[] = new int[n];
		    String s = "Yes";
		    int i = 0;
 
		    for(int q=0;q<n;q++)
		        a[q] = sc.nextInt();
 
		    int l = a[k-1];
		    Arrays.sort(a);
 
		    for(i=0;i<n;i++)
		    {
		        if(a[i] == l) 
		            break;
		    }
 
		    for(int j=i;j<n-1;j++)
		    {
		        if(a[j+1]-a[j] > l)
		        {
		            s = "No";
		            break;
		        }
		    }
 
		    System.out.println(s);
		}
	}
}