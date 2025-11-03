import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if((n&1) == 1)
            System.out.println(0);
        else
            System.out.println((int)Math.pow(2, n/2));
    }
}