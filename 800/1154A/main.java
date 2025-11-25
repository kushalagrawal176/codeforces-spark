import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int maxi = Math.max(a, Math.max(b, Math.max(c,d)));
        
        if(maxi == a)
            System.out.println((maxi-b)+" "+(maxi-c)+" "+(maxi-d));
        else if(maxi == b)
            System.out.println((maxi-a)+" "+(maxi-c)+" "+(maxi-d));
        else if(maxi == c)
            System.out.println((maxi-b)+" "+(maxi-a)+" "+(maxi-d));
        else
            System.out.println((maxi-b)+" "+(maxi-c)+" "+(maxi-a));
    }
}