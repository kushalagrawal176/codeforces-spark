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
            
            int sum = 0;
            int negative = 0;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if(a<0)
                    negative++;
                sum += a;
            }
            int cnt = 0;
            
            if(sum < 0)
                cnt = (-sum+1)/2;
            
            if(((cnt&1) ^ (negative&1)) == 1)
                cnt++;
 
            System.out.println(cnt);
        }
    }
}