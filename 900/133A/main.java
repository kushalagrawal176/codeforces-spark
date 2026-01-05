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
            char ch = s.charAt(i);
            if (ch == 'H' || ch == 'Q' || ch == '9') 
            {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
