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

            int cnt = 0;
            for (int i = 1; i < s.length() - 1; i++) 
            {
                if (s.charAt(i) == 'u') 
                {
                    if (s.charAt(i - 1) == 'u') 
                    {
                        // replace with 's'
                        s = s.substring(0, i - 1) + 's' + s.substring(i);
                        cnt++;
                    }
                    if (s.charAt(i + 1) == 'u') 
                    {
                        // replace with 's'
                        s = s.substring(0, i + 1) + 's' + s.substring(i + 2);
                        cnt++;
                    }
                }
            }

            if (s.charAt(0) == 'u')
                cnt++;
            
            if (s.charAt(s.length() - 1) == 'u')
                cnt++;

            System.out.println(cnt);
        }
    }
}
