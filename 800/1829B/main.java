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
            int zero = 0;
            
            int cnt = 0;
            int a = sc.nextInt();
            
            if(a == 0)
                cnt++;
            
            for(int i=1;i<n;i++)
            {
                a = sc.nextInt();
                if(a == 0)
                    cnt++;
                else
                {
                    zero = Math.max(zero, cnt);
                    cnt = 0;
                }
            }
            
            System.out.println(Math.max(zero, cnt));
        }
    }
}