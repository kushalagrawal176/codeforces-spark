import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long a[] = new long[n];
        long b[] = new long[n];
        
        a[0] = sc.nextInt();
        b[0] = a[0];
        
        for(int i=1;i<n;i++)
        {
            a[i] = sc.nextInt();
            b[i] = a[i];
            a[i] = a[i] + a[i-1];
        }
        
        Arrays.sort(b);
        
        for(int i=1;i<n;i++)
            b[i] = b[i] + b[i-1];
        
        int m = sc.nextInt();
        while(m-- > 0)
        {
            if(sc.nextInt() == 1)
            {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                if(l-2 >= 0)
                    System.out.println(a[r-1] - a[l-2]);
                else
                    System.out.println(a[r-1]);
            }
            else
            {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                if(l-2 >= 0)
                    System.out.println(b[r-1] - b[l-2]);
                else
                    System.out.println(b[r-1]);
            }
        }
    }
}