import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long a[] = new long[56];
        a[0] = 1;
        for(int i=1;i<56;i++)
            a[i] = 2*a[i-1];
        
        long sum = 0;
        for(int i=1;i<=n;i++)
            sum += a[i];
        
        System.out.println(sum);
    }
}