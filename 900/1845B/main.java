import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        while(n-- > 0) 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
 
            int sum = Math.abs(a-c) + Math.abs(a-e) + Math.abs(b-d) + Math.abs(b-f) - Math.abs(c-e) - Math.abs(d-f);
            
            System.out.println(sum/2+1);
        }
    }
}