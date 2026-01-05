import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) 
        {
            int cnt = 1;
            int j = i + 1;

            while (j < s.length() && s.charAt(j) == s.charAt(i)) 
            {
                cnt++;
                if (cnt >= 7) 
                {
                    flag = true;
                    break;
                }
                
                j++;
            }

            if (flag) break;
        }

        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
