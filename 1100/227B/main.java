import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            a[sc.nextInt()] = i+1; 
        }
        
        long cnt_a = 0;
        long cnt_b = 0;
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int ele = sc.nextInt();
            cnt_a += a[ele];
            cnt_b += n-a[ele]+1;
        }
        
        System.out.println(cnt_a+" "+cnt_b);
    }
}