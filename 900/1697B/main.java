import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        long a[] = new long[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextLong();
        
        Arrays.sort(a);
        for(int i=1;i<n;i++)
            a[i] += a[i-1];
        
        while(q-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int s = n-x;
            int e = n-x+y-1;
            
            System.out.println(a[e] - ((s-1 >= 0) ? a[s-1] : 0));
        }
    }
}