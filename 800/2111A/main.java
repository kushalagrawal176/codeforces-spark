import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();

            int cnt = 0;

            while (n != 1) 
            {
                cnt++;
                n = n / 2;
            }

            System.out.println((cnt + 1) * 2 + 1);
        }
    }
}
