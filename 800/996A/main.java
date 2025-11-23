import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long cnt = 0;
        
        while (n > 0) {
            if (n / 100 > 0) {
                cnt += n / 100;
                n %= 100;
            } else if (n / 20 > 0) {
                cnt += n / 20;
                n %= 20;
            } else if (n / 10 > 0) {
                cnt += n / 10;
                n %= 10;
            } else if (n / 5 > 0) {
                cnt += n / 5;
                n %= 5;
            } else {
                cnt += n;
                break;
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
