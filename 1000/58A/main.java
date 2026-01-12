import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);

            if (c == 'h') 
            {
                if (ans.length() == 0) 
                    ans.append('h');
            } 
            else if (c == 'e') 
            {
                if (ans.length() == 1) 
                    ans.append('e');
            } 
            else if (c == 'l') 
            {
                if (ans.length() == 2 || ans.length() == 3) 
                    ans.append('l');
            } 
            else if (c == 'o') 
            {
                if (ans.length() == 4) 
                    ans.append('o');
            }
        }

        if (ans.toString().equals("hello"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
