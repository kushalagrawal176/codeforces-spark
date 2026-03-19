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
			int a[] = new int[n+1];
			int freq[] = new int[n+1];
			
			for(int i=1;i<=n;i++) 
			{
				a[i] = sc.nextInt();
				freq[a[i]]++;
			}
			
			int curL = 0;
			int finalL = 0;
			int curR = 0;
			int finalR = 0;
			
			int maxi = 0;
			
			for(int i=1;i<=n;i++) 
			{
				if(freq[a[i]] == 1)
					curR++;
				else 
				{
					if(curR-curL > maxi) 
					{
						finalL = curL;
						finalR = curR;
						maxi = curR-curL;
					}
					
					curL = i;
					curR = i;
				}
			}
			
			if(curR-curL > maxi)
			{
				finalL = curL;
				finalR = curR;
				maxi = curR-curL;
			}
			
			System.out.println(finalL == finalR? 0: finalL+1+" "+finalR);
		}
	}
}