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
            long cnt = 0;
            long grps = 0;
            
            for(int i=0;i<n;i++)
            {
                cnt++;
                if(cnt >= a[i])
                {
                    grps++;
                    cnt = 0;
                }
            }
            
            System.out.println(grps);
        }
    }
}