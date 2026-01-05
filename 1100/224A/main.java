import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int k = (int)Math.sqrt((a*c)/b);
        
        int side1 = k;
        int side2 = a/k;
        int side3 = (b*k)/a;
        
        System.out.println(4*(side1 + side2 + side3));
    }
}