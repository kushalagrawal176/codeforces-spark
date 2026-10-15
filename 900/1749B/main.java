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
            int b[] = new int[n];
 
            long ans = 0l;
            for(int i=0;i<n;i++) 
            {
                a[i] = sc.nextInt();
                ans += a[i];
            }
 
            int maxStrength = 0;
 
            for(int i=0;i<n;i++) 
            {
                b[i] = sc.nextInt();
 
                maxStrength = Math.max(maxStrength, b[i]);
                ans += b[i];
            }
 
            System.out.println(ans - maxStrength);
        }
    }
}