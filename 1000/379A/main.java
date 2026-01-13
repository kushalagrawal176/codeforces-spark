import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // initial candles
        int b = sc.nextInt();  // exchange rate

        int cnt = a;  // total candles burned
        int rem, i;

        while (a >= b) 
        {
            i = a / b;       // new candles obtained
            cnt += i;        // add them to total
            rem = a % b;     // leftover candles
            a = i + rem;     // update available candles
        }

        System.out.println(cnt);
    }
}
