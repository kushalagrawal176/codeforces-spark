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
            int a[] = new int[n];
            int val = 0;
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                val = (val ^ a[i]);
            }
    
            int ans = 0;
            
            for(int i=0;i<n;i++)
                ans = (ans ^ (a[i] ^ val));
            
            if(ans == 0)
                System.out.println(val);
            else
                System.out.println("-1");
        }
    }
}