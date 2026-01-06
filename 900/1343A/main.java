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

            long sum = 3;  // initial sum = 2^1 + 2^2 = 3
            int k = 3;

            // keep increasing sum until n % sum == 0
            while (n % sum != 0) 
            {
                sum += (long) Math.pow(2, k - 1);
                k++;
            }

            System.out.println(n / sum);
        }
    }
}
