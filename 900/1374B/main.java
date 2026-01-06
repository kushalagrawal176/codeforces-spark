import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            long n = sc.nextLong();
            HashSet<Long> visited = new HashSet<>();

            long cnt = 0;
            while (n != 1) 
            {
                if (visited.contains(n)) 
                {
                    cnt = -1;
                    break;
                }

                visited.add(n);

                if (n % 6 == 0)
                    n /= 6;
                else
                    n *= 2;

                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
