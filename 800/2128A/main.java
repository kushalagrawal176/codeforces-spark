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
            int c = sc.nextInt();
            
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            int coins = 0;
            long m = 1;
            
            for(int i=n-1;i>=0;i--)
            {
                if(a[i] * m <= c)
                    m = m*2;
                else
                    coins++;
            }
            
            System.out.println(coins);
        }
    }
}