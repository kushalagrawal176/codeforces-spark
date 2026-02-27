import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
 
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
 
            long z = 0;
            long y;
            for(int i=0;i<n-1;i++)
                z += Math.abs(a[i]-a[i+1]);
 
            y = z - Math.abs(a[0]-a[1]);
            y = Math.min(y, z-Math.abs(a[n-2]-a[n-1]));
 
            for(int i=1;i<n-1;i++)
                y = Math.min(y, z-Math.abs(a[i-1]-a[i])-Math.abs(a[i]-a[i+1])+Math.abs(a[i-1]-a[i+1]));
 
            System.out.println(y);
        }
    }
}