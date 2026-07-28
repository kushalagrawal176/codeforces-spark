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
            
            int a[][] = new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    a[i][j] = sc.nextInt();
            }
            
            int cnt = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j] >= 0)
                        continue;
                    
                    int mini = Integer.MAX_VALUE;
                    int t_i = i;
                    int t_j = j;
                    
                    while(t_i < n && t_j < n)
                    {
                        if(a[t_i][t_j] < 0)
                            mini = Math.min(mini, a[t_i][t_j]);
                        
                        a[t_i][t_j] = 0;
                        t_i++;
                        t_j++;
                    }
                    
                    cnt += -1 * mini;
                }
            }
            
            System.out.println(cnt);
        }
    }
}