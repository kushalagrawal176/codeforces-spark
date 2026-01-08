import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            int x = 1;
            
            while(n%x == 0)
                x++;
            
            System.out.println(x-1);
        }
    }
}