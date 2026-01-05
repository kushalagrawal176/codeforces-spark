import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++)
            v[i] = sc.nextInt();

        Arrays.sort(v); // sort in ascending order

        for (int i = 0; i < n; i++)
            System.out.print(v[i] + " ");
    }
}
