import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k,n,w;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        
        int cost = w*k*(w+1)/2;
        if(cost >= n)
            System.out.println(cost-n);
        else
            System.out.println(0);
    }
}