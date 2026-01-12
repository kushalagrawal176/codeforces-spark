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

            // Check if character is a vowel (both uppercase and lowercase)
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') 
            {
                continue; // skip vowels
            } 
            else 
            {
                ans.append('.');
                // Convert uppercase to lowercase
                if (Character.isUpperCase(c))
                    ans.append(Character.toLowerCase(c));
                else
                    ans.append(c);
            }
        }

        System.out.println(ans.toString());
    }
}
