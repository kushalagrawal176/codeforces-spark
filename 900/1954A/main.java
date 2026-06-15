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
            int m = sc.nextInt();
            int k = sc.nextInt();

            // Calculate the maximum number of elements per group
            // If n is not divisible by m, we need to account for the extra elements
            // This means we need one more group to accommodate the remaining elements
            // So we take the ceiling of n / m
            // This gives us the maximum number of elements that can be in each group

            System.out.println((k >= n-((n%m==0) ? n/m : (n/m)+1)) ? "NO" : "YES");
        }
    }
}