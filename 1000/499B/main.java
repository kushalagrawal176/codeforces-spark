import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // Map to store the shorter synonym for each word
        HashMap<String, String> mp = new HashMap<>();

        for (int i = 0; i < m; i++) 
        {
            String a = sc.next();
            String b = sc.next();

            if (a.length() <= b.length()) 
            {
                mp.put(a, a);   // keep 'a' as itself
                mp.put(b, a);   // map 'b' to 'a'
            } 
            else 
            {
                mp.put(b, b);   // keep 'b' as itself
                mp.put(a, b);   // map 'a' to 'b'
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) 
        {
            String word = sc.next();
            if (mp.containsKey(word))
                sb.append(mp.get(word)).append(" ");
            else
                sb.append(word).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
