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

            int freq[] = new int[26];
            int ballons = 0;

            for(int i=0;i<n;i++)
            {
                if(freq[s.charAt(i)-'A'] == 0)
                    ballons++;

                freq[s.charAt(i)-'A']++;
                ballons++;
            }

            System.out.println(ballons);
        }
    }
}