import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int k = sc.nextInt();
            int x = sc.nextInt();
            
            long n = x;
            while(k-- > 0)
            {
                n = n*2;
            }
            
            System.out.println(n);
        }
    }
}