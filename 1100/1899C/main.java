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
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            long sum = a[0];
            long s = a[0];
            
            for(int i=1;i<n;i++)
            {
                if((a[i]&1) == (a[i-1]&1))
                {
                    s = a[i];
                }
                else
                {
                    s = Math.max(s+a[i], a[i]);
                }
                sum = Math.max(sum, s);
            }
            
            sum = Math.max(sum, s);
            
            System.out.println(sum);
        }
    }
}