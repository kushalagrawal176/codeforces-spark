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
            int k = sc.nextInt();
            
            int cnt = 0;
            int sum = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(a == 0 && sum > 0)
                {
                    sum--;
                    cnt++;
                }
                if(a >= k)
                    sum += a;
            }
            
            System.out.println(cnt);
        }
    }
}