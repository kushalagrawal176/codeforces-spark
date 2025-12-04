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
            int bit[] = new int[32];
            
            long cnt = 0;
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                for(int b=31;b>=0;b--)
                {
                    if(((a>>b)&1) == 0)
                        continue;
                    
                    cnt += bit[b];
                    bit[b]++;
                    break;
                }
            }
            
            System.out.println(cnt);
        }
    }
}