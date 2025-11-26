import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            maxi = Math.max(maxi, v[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (maxi - v[i]);
        }

        System.out.println(sum);
    }
}
