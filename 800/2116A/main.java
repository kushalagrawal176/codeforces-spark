import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int mini = Math.min(a, b);
            mini = Math.min(c, mini);
            mini = Math.min(d, mini);

            if(mini == b || mini == d)
                System.out.println("Gellyfish");
            else
                System.out.println("Flower");
        }
    }
}