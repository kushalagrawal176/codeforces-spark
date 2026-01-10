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
            long x = sc.nextLong();
            
            Long a[] = new Long[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();
                
            Arrays.sort(a, Collections.reverseOrder());
            
            long sum = 0;
            int cnt = 0;
            
            for(int i=0;i<n;i++)
            {
                sum += a[i];
                if(sum/(i+1) >= x)
                    cnt++;
                else
                    break;
            }
            
            System.out.println(cnt);
        }
    }
}