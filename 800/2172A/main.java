import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c)) >= 10)
            System.out.println("check again");
        else
            System.out.println("final " + ((a+b+c) - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c))));
    }
}