import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // The formula directly gives the number of valid positions
        int result = Math.min(n - a, b + 1);

        System.out.println(result);
    }
}
