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
    		long c = sc.nextLong();
    		
    		int[] arr = new int[n];
    		for(int i=0;i<n;i++)
    		{
    			arr[i] = sc.nextInt()+i+1;
    		}
    		
    		Arrays.sort(arr);
    		int cnt = 0;
    		
    		for(int i=0;i<n;i++)
    		{
    			if(arr[i] <= c) 
    			{
    				c -= arr[i];
    				cnt++;
    			}
    			else 
    			    break;
    		}
    		
    		System.out.println(cnt);
		}
	}
}