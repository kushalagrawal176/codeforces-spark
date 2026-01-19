import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long l = sc.nextLong();
        
        ArrayList<Long> a = new ArrayList<Long>();
        for(int i=0;i<n;i++)
            a.add(sc.nextLong());
        
        Collections.sort(a);
        
        double ans = 0.0d;
        
        ans = Math.max(ans, a.get(0)-0);
        ans = Math.max(ans, l-a.get(n-1));
        
        for(int i=0;i<n-1;i++)
            ans = Math.max(ans, (a.get(i+1)-a.get(i))/2.0);
        
        System.out.println(ans);
    }
}