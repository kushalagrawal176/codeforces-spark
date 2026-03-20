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
            int freq[] = new int[2*n+1];
            
            for(int i=0;i<n*2;i++)
            {
            	int a = sc.nextInt();
            	freq[a]++;
            }
            
            int k = 0,m = 0;
            for(int i=1;i<=2*n;i++)
            {
            	if(freq[i] == 0) 
            	    continue;

            	if((freq[i]&1) == 1) 
            	    m++;
            	else 
            	    k++;
            }
            
            System.out.println(m == 0 ? ((n&1) != (k&1) ? 2*k+m-2 : 2*k+m) : 2*k+m);
		}
	}
}