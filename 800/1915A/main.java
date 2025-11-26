import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Using XOR trick: (a ^ b ^ c) gives the unique element
            System.out.println((a ^ b ^ c));
        }
    }
}
