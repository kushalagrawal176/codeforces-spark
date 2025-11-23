import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int count = 0;
        
        for (int i = 1; i <= e; i++) {
            if (i % a == 0 || i % b == 0 || i % c == 0 || i % d == 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
