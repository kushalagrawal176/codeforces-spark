import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;

            while (n != 0) {
                sum += n % 10;  // add last digit
                n /= 10;        // remove last digit
            }

            System.out.println(sum);
        }
    }
}
