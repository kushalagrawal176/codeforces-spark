import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxi = a + b + c;
        maxi = Math.max(maxi, a + b * c);
        maxi = Math.max(maxi, a * b * c);
        maxi = Math.max(maxi, (a + b) * c);
        maxi = Math.max(maxi, a * b + c);
        maxi = Math.max(maxi, a * (b + c));

        System.out.println(maxi);
    }
}
