import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            int a = sc.nextInt();

            if (a + 1 <= 67 && a + 1 >= -67)
                System.out.println(a + 1);
            else
                System.out.println(a);
        }
    }
}
