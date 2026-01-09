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
            String ans = "";
            
            for (int i = 9; i >=1; i--) 
            {
                if(n >= i)
                {
                    ans = i+ans;
                    n -= i;
                }
            }
            
            System.out.println(n==0?ans:-1);
        }
    }
 
}