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

            int ts = 0;
            int f = 0;
            int n = 0;

            // Count occurrences of T, F, N
            for (int i = 0; i < s.length(); i++) 
            {
                char ch = s.charAt(i);
                if (ch == 'T')
                    ts++;
                else if (ch == 'N')
                    n++;
                else if (ch == 'F')
                    f++;
            }

            StringBuilder ans = new StringBuilder();

            // Append all T's
            for (int i = 0; i < ts; i++) 
                ans.append('T');
        
            // Append all F's
            for (int i = 0; i < f; i++) 
                ans.append('F');
            
            // Append all N's
            for (int i = 0; i < n; i++) 
                ans.append('N');
            

            // Append other characters in original order
            for (int i = 0; i < s.length(); i++) 
            {
                char ch = s.charAt(i);
                if (ch != 'T' && ch != 'F' && ch != 'N') 
                    ans.append(ch);
            }

            System.out.println(ans.toString());
        }
    }
}
