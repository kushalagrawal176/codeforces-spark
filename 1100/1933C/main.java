import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            long a,b,l;
            a = sc.nextLong();
            b = sc.nextLong();
            l = sc.nextLong();
 
            Set<Long> s1 = new HashSet<>();
            for(long i=0;Math.pow(a,i)<=l;i++)
            {
                for(long j=0;Math.pow(b,j)<=l;j++)
                {
                    long lc = (long)Math.pow(a,i)*(long)Math.pow(b,j);
 
                    if(l%lc == 0)
                        s1.add(l/lc);
                }
            }
 
            System.out.println(s1.size());
        }
    }
}