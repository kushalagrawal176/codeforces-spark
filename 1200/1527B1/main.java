import java.util.*;
 
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            
            int zero=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '0')
                    zero++;
            }
            
            if(zero == 1 || zero % 2 == 0) 
                System.out.println("BOB");
            else 
                System.out.println("ALICE");
        }
    }
}