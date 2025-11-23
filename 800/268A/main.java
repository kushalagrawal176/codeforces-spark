import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int h[] = new int[n];
        int a[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            h[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && h[i] == a[j])
                    cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}