import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) 
        {
            int n = sc.nextInt();
            String s = sc.next();

            String ans = "";

            boolean possible = true;
            boolean hasR = false;
            boolean hasB = false;

            for(int i = 0; i < n; i++) 
            {
                char c = s.charAt(i);
                if (c == 'W') 
                {
                    // The previous colored segment must contain both R and B.
                    if (hasR != hasB)
                        possible = false;

                    // Start a new segment.
                    hasR = false;
                    hasB = false;
                } 
                else if (c == 'R')
                    hasR = true;
                else // c == 'B'
                    hasB = true;
            }

            // Check the last segment.
            if(hasR != hasB)
                possible = false;

            if(possible)
                ans += "YES\n";
            else
                ans += "NO\n";
        }

        System.out.print(ans);
    }
}