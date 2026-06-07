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
            int k = sc.nextInt();

            String s = sc.next();

            int f1[] = new int[26];
            int f2[] = new int[26];

            // Count frequency of each character
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    f2[s.charAt(i)-'A']++;
                else
                    f1[s.charAt(i)-'a']++;
            }

            // Calculate the maximum number of matching pairs
            // For each character, we can form pairs from the available lowercase and uppercase characters
            // The minimum frequency of each character in both cases will give us the number of pairs

            int cnt = 0;
            for(int i=0;i<26;i++)
            {
                int m = Math.min(f1[i], f2[i]);
                cnt += m;
                
                f1[i] -= m;
                f2[i] -= m;

                // Pair up remaining characters
                // We can pair up the remaining lowercase and uppercase characters
                // The number of pairs we can form is limited by k
                // We can use up to k pairs from the remaining characters

                cnt += Math.min(k, (f1[i] + f2[i])/2);
                k -= Math.min(k, (f1[i] + f2[i])/2);

                // Ensure k is not negative
                if(k < 0)
                    k = 0;
            }
 
            System.out.println(cnt);
        }
    }
}