import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
        {
		    int n = sc.nextInt();
		    int a[] = new int[101];
 
		    for(int i=1;i<=n;i++)
		        a[sc.nextInt()]++;
		    
		    int mex = 0;
		    int t1 = 2;
 
            while(t1-- > 0)
            {
                int index = 0;
 
                while(true)
                {
                    if(a[index] == 0)
                    {
                        mex += index;
                        break;
                    }                    
                    else 
                        a[index]--;
 
                    index++;
                }
            }
 
		    System.out.println(mex);
		}
	}