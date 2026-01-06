import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int num1 = a / 10;
        int num2 = (a / 100) * 10 + a % 10;

        System.out.println(Math.max(num1, Math.max(a, num2)));
    }
}
