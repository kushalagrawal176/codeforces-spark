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

            String ans = "YES";

            if(n != 5)
                ans = "NO";
            else
            {
                if(!(s.charAt(0) == 'T' || s.charAt(1) == 'T' || s.charAt(2) == 'T' || s.charAt(3) == 'T' || s.charAt(4) == 'T'))
                    ans = "NO";

                if(!(s.charAt(0) == 'i' || s.charAt(1) == 'i' || s.charAt(2) == 'i' || s.charAt(3) == 'i' || s.charAt(4) == 'i'))
                    ans = "NO";

                if(!(s.charAt(0) == 'm' || s.charAt(1) == 'm' || s.charAt(2) == 'm' || s.charAt(3) == 'm' || s.charAt(4) == 'm'))
                    ans = "NO";

                if(!(s.charAt(0) == 'u' || s.charAt(1) == 'u' || s.charAt(2) == 'u' || s.charAt(3) == 'u' || s.charAt(4) == 'u'))
                    ans = "NO";

                if(!(s.charAt(0) == 'r' || s.charAt(1) == 'r' || s.charAt(2) == 'r' || s.charAt(3) == 'r' || s.charAt(4) == 'r'))
                    ans = "NO";
            }

            System.out.println(ans);
        }
    }
}