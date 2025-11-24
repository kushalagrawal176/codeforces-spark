import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int prob = ((240 - k)*2)/5;
        
        while(n*(n+1) > prob)
            n--;
        
        System.out.println(n);
    }
}