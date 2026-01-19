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
        int e = sc.nextInt();
        
        int sum = a+b+c+d+e;
        
        if(sum%5 == 0 && sum > 0)
            System.out.println((a+b+c+d+e)/5);
        else
            System.out.println(-1);
    }
}