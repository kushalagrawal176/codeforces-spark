import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int cost = 0;
        
        if(n%m != 0)
            cost = cost + (n%m)*a;
        
        System.out.println(Math.min(n*a, Math.min(cost+(n/m)*b, (n/m+1)*b)));
    }
}