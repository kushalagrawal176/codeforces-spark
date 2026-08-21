import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(); 
        long r = sc.nextLong(); 
 
        if(r-l <= 1 || (r-l == 2 && l%2 == 1))
            System.out.println(-1);
        else
        {
            if(l%2 == 1)
                l++;
 
            System.out.println(l+" "+(l+1)+" "+(l+2));
        }
    }
}