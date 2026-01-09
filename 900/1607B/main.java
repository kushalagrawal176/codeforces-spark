import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long x = sc.nextLong();
            long n = sc.nextLong();
            
            long a[] = {0,-1*n,1,n+1};
            
            if(x%2 == 0)
                System.out.println(x + a[(int)(n%4)]);
            else
                System.out.println(x - a[(int)(n%4)]);
        }
    }
}