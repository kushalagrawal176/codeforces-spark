import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            String s = sc.next();

            int[] ans = new int[5]; // A, B, C, D, others

            for (int i = 0; i < s.length(); i++) 
            {
                char ch = s.charAt(i);
                if (ch == 'A')
                    ans[0]++;
                else if (ch == 'B')
                    ans[1]++;
                else if (ch == 'C')
                    ans[2]++;
                else if (ch == 'D')
                    ans[3]++;
                else
                    ans[4]++;
            }

            int sum = 0;
            for (int i = 0; i < 4; i++) 
            {
                if (ans[i] >= n)
                    sum += n;
                else
                    sum += ans[i];
            }

            System.out.println(sum);
        }
    }
}
