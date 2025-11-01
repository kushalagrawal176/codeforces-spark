import java.util.Scanner;
 
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        long n = in.nextInt();
        System.out.println((n * n + 5) * n / 6);
    }
}