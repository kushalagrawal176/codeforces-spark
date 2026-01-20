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
            
            long sum = 0;
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            
            Arrays.sort(a);
            
            int mid = a[n/2];
            long extra = mid*1L*n*2+1;
            
            if(n <= 2)
                System.out.println(-1);
            else if(extra < sum)
                System.out.println(0);
            else
                System.out.println(extra - sum);
        }
    }
}