import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0, y = 0, z = 0;

        while (n-- > 0) 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            x += a;
            y += b;
            z += c;
        }

        if (x == 0 && y == 0 && z == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
