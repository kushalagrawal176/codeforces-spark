import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) 
        {
            v[i] = sc.nextInt();
            sum += v[i];
        }

        Arrays.sort(v); // sort in ascending order

        int cnt = 0;
        int s = 0;
        int i = n - 1; // start from largest coin

        while (s <= sum / 2) 
        {
            s += v[i];
            cnt++;
            i--;
        }

        System.out.println(cnt);
    }
}
