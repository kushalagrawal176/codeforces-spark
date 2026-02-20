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
            
            int one = 0;
            int zero = 0;
            int neg = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(a == -1)
                    neg++;
                else if(a == 1)
                    one++;
                else
                    zero++;
            }
            
            int cnt = 0;
            cnt += zero;
            
            if((neg&1) == 1)
                cnt += 2;
            
            System.out.println(cnt);
        }
    }
}