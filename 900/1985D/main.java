import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) 
        {
            long si = 0, sj = 0, cnt = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i = 1; i <= n; i++) 
            {
                String row = sc.next(); // read the entire row as a string
                for (int j = 1; j <= m; j++) 
                {
                    char c = row.charAt(j - 1);
                    if (c == '#') 
                    {
                        si += i;
                        sj += j;
                        cnt++;
                    }
                }
            }

            System.out.println((si / cnt) + " " + (sj / cnt));
        }
    }
}
