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
            
            int alice = 0;
            int bob = n-1;
            
            int a_weight = a[0];
            int b_weight = a[n-1];
            
            int cnt = 0;
            
            while(alice < bob)
            {
                if(a_weight == b_weight)
                {
                    cnt = Math.max(cnt, alice+1 + n-bob);
                }
                if(a_weight <= b_weight)
                {
                    alice++;
                    a_weight += a[alice];
                }
                else
                {
                    bob--;
                    b_weight += a[bob];
                }
            }
            
            System.out.println(cnt);
        }
    }
}