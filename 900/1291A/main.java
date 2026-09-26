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

            // Find the first two odd digits
            String ans = "";
            for(int i=0;i<n;i++)
            {
                if((s.charAt(i)-'0')%2 == 1)
                    ans += s.charAt(i);
 
                if(ans.length() == 2)
                    break;
            }
 
            System.out.println((ans.length() == 2) ? ans:"-1");
        }
    }
}