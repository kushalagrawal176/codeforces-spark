import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) 
        {
            String s = sc.next();

            // Replace the second last character with 'i'
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(sb.length() - 2, 'i');

            // Remove the last character
            sb.deleteCharAt(sb.length() - 1);

            System.out.println(sb.toString());
        }
    }
}
