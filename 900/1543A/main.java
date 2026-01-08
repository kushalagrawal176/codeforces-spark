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
            long c = Math.abs(a-b);
            System.out.print(c);
            
            if(a == b)
                System.out.println(" " + 0);
            else
                System.out.println(" " + Math.min(a%c, c - a%c));
        }
    }
}