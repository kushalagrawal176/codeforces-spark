import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int a[] = new int[m+1];
        for(int i=0;i<=m;i++)
            a[i] = sc.nextInt();
        
        int cnt = 0;
        for(int i=0;i<m;i++)
        {
            if(Integer.bitCount(a[i]^a[m]) <= k)
                cnt++;
        }
        
        System.out.println(cnt);
    }
}