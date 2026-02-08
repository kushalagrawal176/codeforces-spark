import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            String s = sc.next();  // input string

            char prev = s.charAt(0);
            boolean flag = true;

            for (int i = 1; i < s.length(); i++) 
            {
                if (prev == 'Y' && s.charAt(i) == 'Y') 
                {
                    flag = false;
                    break;
                }

                if (prev == s.charAt(i))
                    prev = 'N';
                else 
                    prev = 'Y';
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
