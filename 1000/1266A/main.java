import java.util.*;
 
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n > 0)
        {
            String a = sc.next();
            
            int even = 0;
            int zero = 0;
            long sum = 0;
            
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i) == '0')
                    zero++;
                if((a.charAt(i)-'0')%2 == 0)
                    even++;
                
                sum = sum + a.charAt(i)-'0';
            }
            
            if(zero > 0 && even >= 2 && sum%3 == 0)
                System.out.println("red");
            else
                System.out.println("cyan");
            n--;
        }
    }
}