import java.util.*;
public class main
{
    public static long nCr(int n, int r) 
    {
        if (r < 0 || r > n) 
            return 0;
            
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 1; i <= r; i++)
            res = res * (n - r + i) / i;
        
        return res;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        int sum1 = 0;
        int sum2 = 0;
        int k = 0;
        
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == '+')
                sum1++;
            else
                sum1--;
            
            if(b.charAt(i) == '?')
                k++;
            else if(b.charAt(i) == '+')
                sum2++;
            else
                sum2--;
        }
        
        int needed = sum1 - sum2;
        
        if((needed+k)%2 != 0)
        {
            System.out.println(0.0);
            return ;
        }
        
        int x = (needed+k)/2;
        
        if(x < 0 || x > k)
        {
            System.out.println(0.0);
            return ;
        }
        
        long fav = nCr(k, x);
        double total = Math.pow(2, k);
        
        System.out.println(fav/total);
    }
}