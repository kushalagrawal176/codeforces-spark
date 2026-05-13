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
            long e = 0;
 
            ArrayList<Long> o = new ArrayList<>();
 
            for(int i=0;i<n;i++)
            {
                long x = sc.nextLong();
                if((x&1) == 0)
                    e += x;
                else
                    o.add(x);
            }
 
            if(o.size() == 0)
            {
                System.out.println(0);
                continue;
            }
 
            Collections.sort(o);
 
            int k = o.size(), take = (k+1)/2;
            long ans = e;
 
            for(int i=0;i<take;i++)
                ans += o.get(k-1-i);
 
            System.out.println(ans);
        }
    }
}