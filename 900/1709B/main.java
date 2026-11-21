import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
 
        long pre[] = new long[n+1];
        long suff[] = new long[n+1];
 
        for(int i=1;i<n;++i)
            pre[i+1] = pre[i] + (a[i-1] > a[i] ? a[i-1]-a[i] : 0);
 
        for(int i=n-2;i>=0;--i)
            suff[i+1] = suff[i+2] + (a[i+1] > a[i] ? a[i+1]-a[i] : 0);
 
        while(m-- > 0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            if(l < r) 
                System.out.println(pre[r]-pre[l]);
            else 
                System.out.println(suff[r]-suff[l]);
        }
    }
}