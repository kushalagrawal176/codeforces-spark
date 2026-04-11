import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int k = sc.nextInt();

            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();

            int sum1 = a1+a2;
            int sum2 = b1+b2;
            
            String ans = "";

            if(sum1 > sum2+k)
                ans = "NO";
            else if(sum1 == sum2+k)
            {
                if(a1 > b1 && a2 > b2)
                    ans = "NO";
                else
                    ans = "YES";
            }
            else if(sum1+k < sum2)
                ans = "YES";
            else if(sum1+k == sum2)
            {
                if(a1 > b1 && a2 > b2)
                    ans = "NO";
                else
                    ans = "YES";
            }
            else
                ans = "YES";
            
            System.out.println(ans);
        }
    }
}