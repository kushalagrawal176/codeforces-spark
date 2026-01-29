import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        
        long cost = 0;
        
        for(int i=0;i<n;i++)
        {
            cost += Math.abs((i+1)-a[i]);
        }
        
        System.out.println(cost);
    }
}