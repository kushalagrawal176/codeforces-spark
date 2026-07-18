import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int x = 1;
 
            while(x < n) 
                x *= 2;
 
            x /= 2;
            for(int i=x-1;i>=0;i--) 
                System.out.print(i + " ");
 
            for(int i=x;i<n;i++) 
                System.out.print(i + " ");
 
            System.out.println();
        }
    }
}