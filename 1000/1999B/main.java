import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) 
        {
            int ans = 0;
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if ((a >= c && b > d) || (a > c && b >= d))
                ans++;
            if ((a >= d && b > c) || (a > d && b >= c))
                ans++;
            
            System.out.println(ans * 2);
        }
    }
}
