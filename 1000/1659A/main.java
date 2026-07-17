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
            int r = sc.nextInt();
            int b = sc.nextInt();
            
            int k = r/(b+1);
			int m = r%(b+1);
			
			for(int i=1;i<=b+1;i++)
			{
				for(int j=1;j<=k+((i<=m)? 1:0);j++)
					System.out.print("R");
 
				if(i <= b)
					System.out.print("B");
			}
 
			System.out.println();
        }
    }
}