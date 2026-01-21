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
            int x = sc.nextInt();
            
            int s = 0;
            int cnt = -1;
            
            for(int i=0;i<n;i++)
            {
                s = s+sc.nextInt();
                
                if(s%x != 0)
                    cnt = Math.max(cnt, Math.max(i+1, n-i-1));
            }
            
            System.out.println(cnt);
        }
    }
}