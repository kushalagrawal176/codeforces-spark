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
 
            long a[] = new long[n];
            long p[] = new long[n];
            int v[][] = new int[n][2];
 
            for(int i=0;i<n;i++)
            {
                v[i][0] = sc.nextInt();
                v[i][1] = i;
            }
 
            Arrays.sort(v,(x,y)->Integer.compare(x[0],y[0]));
            p[0] = v[0][0];
 
            for(int i=1;i<n;i++)
                p[i] = p[i-1] + v[i][0];
 
            a[v[n-1][1]] = n-1;
            for(int i=n-2;i>=0;i--)
            {
                long u = p[i];
                if(u >= v[i+1][0])
                    a[v[i][1]] = a[v[i+1][1]];
                else
                    a[v[i][1]] = i;
            }
 
            for(int i=0;i<n;i++)
                System.out.print(a[i]+(i==n-1?"\n":" "));
        }
    }
}