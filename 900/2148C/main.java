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
            int m = sc.nextInt();
            
            int prev_a = 0;
            int prev_b = 0;
            
            long cnt = 0;
            
            // diff even - 
            //   - bits changes -> (diff-1)
            //   - bits same -> (diff)
            // diff odd - 
            //   - bits change -> diff
            //   - bits same -> diff-1
 
            while(n-- > 0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if((a-prev_a)%2 == 0)
                {
                    if(b == prev_b)
                        cnt += (a-prev_a);
                    else
                        cnt += (a-prev_a)-1;
                }
                else
                {
                    if(b == prev_b)
                        cnt += (a-prev_a)-1;
                    else
                        cnt += (a-prev_a);
                }
                
                prev_a = a;
                prev_b = b;
            }
            
            cnt += m-prev_a;
            System.out.println(cnt);
        }
    }
}