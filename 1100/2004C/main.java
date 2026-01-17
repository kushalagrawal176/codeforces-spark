import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            int n = sc.nextInt(), k = sc.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            int kk = (n - 1) % 2;
            long al = 0, bo = 0;
            
            for (int i = n - 1; i >= 0; i--) 
            {
                if (i % 2 == kk) 
                    al += a[i];
                else 
                {
                    int dif = Math.min(a[i + 1] - a[i], k);
                    k -= dif;
                    bo += dif + a[i];
                }
            }
            
            System.out.println(al - bo);
        }
    }
}