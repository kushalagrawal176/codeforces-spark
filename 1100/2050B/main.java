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
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
 
            long sumOdd = 0, sumEven = 0;
            for (int i = 0; i < n; i++) 
            {
                if (i % 2 == 0) 
                    sumOdd += a[i]; // 1-based odd index
                else 
                    sumEven += a[i]; // 1-based even index
            }
 
            long countOdd = (n + 1L) / 2;
            long countEven = n / 2L;
 
            if (sumOdd % countOdd != 0 || sumEven % countEven != 0)
                System.out.println("NO");
            else 
            {
                long valOdd = sumOdd / countOdd;
                long valEven = sumEven / countEven;
                
                System.out.println(valOdd == valEven ? "YES" : "NO");
            }
        }
    }
}