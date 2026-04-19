import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long p = sc.nextLong();
            long q = sc.nextLong();
            
            if(3*p < 2*q || p >= q)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }
    }
}