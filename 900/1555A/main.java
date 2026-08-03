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
            n = n*5;

            // If the last digit is 5, add 5
            if(n%10 == 5)
                n += 5;
            
            n = n/2;
            
            System.out.println(n>=15 ? (long)n : 15);
        }
    }
}