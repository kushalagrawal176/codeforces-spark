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
 
            Long a[] = new Long[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();
 
            Arrays.sort(a, Collections.reverseOrder());
 
            long sum = 0;
            for(int i=0;i<Math.min(n, m);i++)
                sum += a[i]*(m-i);
 
            System.out.println(sum);
        }
    }
}