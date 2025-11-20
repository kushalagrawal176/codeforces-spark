import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            
            long cnt = 0;
            
            long moves_x = x/k + (x%k == 0 ? 0:1);
            long moves_y = y/k + (y%k == 0 ? 0:1);
            
            cnt += Math.max(2*moves_x-1, 2*moves_y);
            
            System.out.println(cnt);
        }
    }
}