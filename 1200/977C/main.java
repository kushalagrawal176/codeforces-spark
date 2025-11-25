import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int a[] = new int[n+1];
        a[0] = 1;
        for(int i=1;i<=n;i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        
        int ans = -1;
        
        if(k < n && a[k] == a[k+1])
            ans = -1;
        else if(k == 0 && a[1] == 1)
            ans = -1;
        else
            ans = a[k];
        
        System.out.println(ans);
    }
}