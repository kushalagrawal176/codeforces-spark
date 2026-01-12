import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean flag = true;

        // Check if all characters except the first are uppercase
        for (int i = 1; i < s.length(); i++) 
        {
            if (!Character.isUpperCase(s.charAt(i))) 
            {
                flag = false;
                break;
            }
        }

        if (!flag)
            System.out.println(s);
        else 
        {
            StringBuilder sb = new StringBuilder();

            // Toggle the first character
            char first = s.charAt(0);
            if (Character.isUpperCase(first))
                sb.append(Character.toLowerCase(first));
            else
                sb.append(Character.toUpperCase(first));

            // Convert the rest to lowercase
            for (int i = 1; i < s.length(); i++)
                sb.append(Character.toLowerCase(s.charAt(i)));

            System.out.println(sb.toString());
        }
    }
}
