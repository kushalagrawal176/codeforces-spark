import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = 0;
 
            for (int i = 0; i < n; i++) 
            {
                int num = x;
                if ((x & i) == i) 
                    num = i;
 
                y |= num;
                if (y != x && i == n - 1) 
                    num = x;
 
                System.out.print(num + " ");
            }
 
            System.out.println();
        }
    }
}