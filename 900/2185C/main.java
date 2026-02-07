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
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            
            int len = 1;
            int cnt = 1;
            
            for(int i=1;i<n;i++)
            {
                if(a[i-1] == a[i])
                {}
                else
                {
                    if(a[i-1]+1 == a[i])
                        cnt++;
                    else
                    {
                        len = Math.max(len, cnt);
                        cnt = 1;
                    }
                }
            }
            
            len = Math.max(len, cnt);
            
            System.out.println(len);
        }
    }
}