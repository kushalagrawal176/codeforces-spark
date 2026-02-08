import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();

            int a = sc.nextInt();  // first element

            // read middle elements (ignored in logic)
            for (int i = 1; i < n - 1; i++)
            {
                int temp = sc.nextInt();
            }

            int b = sc.nextInt();  // last element

            if (a == b && a == 0)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
        }
    }
}
