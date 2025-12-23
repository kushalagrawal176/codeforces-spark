import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int a[] = new int[51];
        for(int i=1;i<=n;i++)
        {
            int num = sc.nextInt();
            if(a[num] == 0)
                a[num] = i;
        }
        
        int cnt = 0;
        while(q-- > 0)
        {
            int t = sc.nextInt();
            System.out.print(a[t]+" ");
            int pos = a[t];
            
            for(int i=1;i<=50;i++)
            {
                if(pos > a[i])
                    a[i]++;
            }
            
            a[t] = 1;
        }
    }
}