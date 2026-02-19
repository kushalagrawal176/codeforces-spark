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
            int a = sc.nextInt();
            
            int v[] = new int[n];
            
            for(int i=0;i<n;i++)
                v[i] = sc.nextInt();
            
            int cnt1 = 0;
            int cnt2 = 0;
            
            for(int i=0;i<n;i++)
            {
                if(v[i] < a)
                    cnt1++;
                if(v[i] > a)
                    cnt2++;
            }
                
            System.out.println((cnt1 > cnt2) ? a-1 : a+1);
        }
    }
}