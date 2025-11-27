import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println((n%2+8) + " " + (n-8-n%2));
    }
}