import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            
            int cnt = 0;
            
            n--;
            while(n-- > 0)
            {
                int curr = sc.nextInt();
                if((curr&1) == (prev&1))
                    cnt++;
                
                prev = curr;
            }
            
            System.out.println(cnt);
        }
    }
}