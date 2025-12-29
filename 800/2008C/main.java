import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long l = sc.nextLong();
            long r = sc.nextLong();

            long cnt = 1;
            int i = 1;
            
            while(l < r)
            {
                cnt++;
                l = l + i;
                i++;
            }
            
            if(l == r)
                System.out.println(cnt);
            if(l > r)
                System.out.println(cnt-1);
        }
    }
}