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
            long n = sc.nextLong();
 
            if(n*b <= a || b >= a)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}