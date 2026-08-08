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
            String s = sc.next();
            
            long a = 0;
            long b = 0;
            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '-')
                    a++;
                else
                    b++;
            }
 
            System.out.println(b*(a/2)*((a%2 == 0)? a/2:a/2+1));
        }
    }
}