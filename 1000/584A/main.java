import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // desired length of the number
        String t = sc.next();   // given number string

        if (n < t.length())
            System.out.println(-1);
        else 
        {
            System.out.print(t);

            for (int i = 0; i < n - t.length(); i++) 
                System.out.print(0);
        }
    }
}
