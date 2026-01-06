import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        String s = sc.next();

        String t = "qwertyuiopasdfghjkl;zxcvbnm,./";

        StringBuilder result = new StringBuilder();

        if (ch == 'R') 
        {
            for (int i = 0; i < s.length(); i++) 
            {
                for (int j = 0; j < t.length(); j++) 
                {
                    if (s.charAt(i) == t.charAt(j)) 
                    {
                        result.append(t.charAt(j - 1));
                        break;
                    }
                }
            }
        } 
        else 
        {
            for (int i = 0; i < s.length(); i++) 
            {
                for (int j = 0; j < t.length(); j++) 
                {
                    if (s.charAt(i) == t.charAt(j)) 
                    {
                        result.append(t.charAt(j + 1));
                        break;
                    }
                }
            }
        }

        System.out.println(result.toString());
    }
}
