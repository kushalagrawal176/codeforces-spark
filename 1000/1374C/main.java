import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();  // length of the string
            String s = sc.next();  // bracket sequence

            int cnt = 0;
            for (int i = 0; i < n; i++) 
            {
                if (s.charAt(i) == '(')
                    cnt++;
                else 
                {
                    if (cnt > 0)
                        cnt--;
                }
            }

            System.out.println(cnt);
        }
    }
}
