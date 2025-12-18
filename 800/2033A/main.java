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

            int x = 0;
            String s = "Sakurako";
            x = -1;
            int i = 2;

            while (x >= -n && x <= n) 
            {
                if (s.equals("Sakurako")) 
                {
                    s = "Kosuke";
                    x = x + 2 * i - 1;
                } 
                else 
                {
                    s = "Sakurako";
                    x = x - (2 * i - 1);
                }
                i++;
            }

            System.out.println(s);
        }
    }
}
