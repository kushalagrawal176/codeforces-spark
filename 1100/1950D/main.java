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
            
            for(int i=31;i>=2;i--)
            {
                int a = Integer.parseInt(Integer.toBinaryString(i));
                
                while(n % a==0)
                    n /= a;
            }
            
            if(n == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}