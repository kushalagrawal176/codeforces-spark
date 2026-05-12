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
 
            int res = 1;
            for(int i=0;i<n;i++)
            {
                int x = sc.nextInt();
                if(a[i] > x) 
                    res += a[i] - x;
            }
 
            System.out.println(res);
        }
    }
}