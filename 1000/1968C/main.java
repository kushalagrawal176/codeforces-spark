import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a = 501;
            System.out.print(a + " ");

            for(int i=1;i<n;i++)
            {
                a += sc.nextInt();
                System.out.print(a + " ");
            }
            
            System.out.println();
        }
    }
}