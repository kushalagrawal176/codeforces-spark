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
            String s = sc.next();
            
            long cost = 0;
            long c[] = new long[n+1];
            
            for(int k=1;k<=n;k++)
            {
                for(int j=k;j<=n;j+=k)
                {
                    if(s.charAt(j-1) == '1')
                        break;
                    
                    if(c[j] == 0)
                    {
                        cost += k;
                        c[j] = k;
                    }
                }
            }
            
            System.out.println(cost);
        }
    }
}