import java.util.*;

public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        int one = 0;
        
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            if(a[i] == 1)
                one++;

            // replacing 1 with -1
            // replacing 0 with +1
            
            if(a[i] == 1)
                a[i] = -1;
            else
                a[i] = 1;
        }
        
        if(one == n)
            System.out.println(one-1);
        else if(one == 0)
            System.out.println(n);
        else
        {
            // using Kadane's maximum sub array sum
            
            int sum = Integer.MIN_VALUE;
            int s = 0;
            for(int i=0;i<n;i++)
            {
                s = Math.max(a[i], s+a[i]);
                sum = Math.max(sum, s);
            }
            sum = Math.max(sum, s);
            
            System.out.println(one + sum);
        }
    }
}