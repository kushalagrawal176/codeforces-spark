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
            int h = sc.nextInt();
            int l = sc.nextInt();
            
            int less = 0;
            int more = 0;
            
            for (int i = 0; i < n; i++) 
            {
                int a = sc.nextInt();
                
                if (a <= Math.min(h, l))
                    less++;
                else if (a <= Math.max(h, l))
                    more++;
            }
            
            System.out.println((less + Math.min(less, more)) / 2);
        }
    }
}
