import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int a[] = new int[n];
        for(int i=0; i<n; i++) 
            a[i] = sc.nextInt();
 
        int cur = 0, max = 0;
        for(int i=0; i<2*n; i++) 
        {
            if(a[i%n] == 1) 
            {
                cur++;
                max = Math.max(max, cur);
            } 
            else 
                cur = 0;
        }
 
        System.out.println(Math.min(max, n));
    }
}