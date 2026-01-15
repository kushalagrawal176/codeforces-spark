import java.util.*;
 
public class main
{
	public static void main(String [] args)  
	{
        Scanner sc = new Scanner(System.in);
		 
		int t = sc.nextInt();
		while(t-- > 0) 
		{
			int n=sc.nextInt();
			
			int [] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			int i = 0;
			int j = 0;
			
			boolean b = true;
			int[] ans = new int[n];
			
			while(j < n) 
			{
				if(i == j) 
				{
					if(j == n-1 || arr[i] != arr[i+1]) 
					{
						b = false;
						break;
					}	
				}
				
				if(j < n-1 && arr[j] == arr[j+1])
				{
					ans[j] = j+1;
					j++;
				}
				else if(j == n-1 || arr[j] != arr[j+1]) 
				{
					ans[j] = i;
					i = j+1;
					j = i;
				}
			}
			if(!b) 
			{
				System.out.println(-1);
				continue;
			}
			for(i=0;i<n;i++)
				System.out.print(ans[i]+1+" ");
			
			System.out.println();
		}
	}
}