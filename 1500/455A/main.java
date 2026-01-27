import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long [] a = new long[100001];
        
        for(int i=0;i<n;i++) 
        {
            int x = sc.nextInt();
            a[x] += x;
        }
        
        for(int i=2;i<100001;i++) 
            a[i] = Math.max(a[i]+a[i-2], a[i-1]);
        
        System.out.println(a[100000]);
    }
}