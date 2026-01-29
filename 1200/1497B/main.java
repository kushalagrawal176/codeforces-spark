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
            
            int rem[] = new int[m];
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                rem[a%m]++;
            }
            
            long cnt = 0;
            if(rem[0] > 0)
                cnt++;
            
            for(int i=1;i<m;i++)
            {
                int j = m-i;
                
                if(rem[i] == 0)
                    continue;
                
                if(Math.abs(rem[i]-rem[j]) <= 1)
                    cnt++;
                else
                    cnt += Math.abs(rem[i]-rem[j]);
                
                rem[j] = 0;
            }
            
            System.out.println(cnt);
        }
    }
}