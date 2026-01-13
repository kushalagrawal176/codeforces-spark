import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of cells
        int t = sc.nextInt();  // target cell

        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();

        int cnt = 1;  // starting position

        while (cnt < t)
            cnt = cnt + a[cnt - 1];

        if (cnt == t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
