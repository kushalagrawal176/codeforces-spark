import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[100001];
        
        for(int i=0;i<n;i++)
            a[sc.nextInt()]++;
        
        for(int i=1;i<100001;i++)
            a[i]+=a[i-1];
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++)
        {
            int t = sc.nextInt();
            
            if(t > 100001)
                System.out.println(n);
            else
                System.out.println(a[t]);
        }
    }
}