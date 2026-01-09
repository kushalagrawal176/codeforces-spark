import java.util.*;
 
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        sc.nextLine();

        long sum = 0;
        int ans = 0;

        for(int i = 0; i < n; i++) 
        {
            int x = sc.nextInt();

            if(x<=b)
                sum += x;
            if(sum>d) 
            {
                sum = 0;
                ans++;
            }
        }

        System.out.println(ans);
    }
}