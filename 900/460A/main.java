import java.util.*;

public class main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // Formula derived from the problem statement
        System.out.println((n * m - 1) / (m - 1));
    }
}
