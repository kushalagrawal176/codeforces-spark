import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            a += c/2;
            b += c/2;
            
            if(c%2 == 1)
                a++;
            
            if(a > b)
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}