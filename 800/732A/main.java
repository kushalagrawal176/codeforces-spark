import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();  // price of one shovel
        int r = sc.nextInt();  // desired last digit
        
        int count = 1;
        for (int i = 1; i <= 1000; i++) {
            if ((k * i) % 10 == r || (k * i) % 10 == 0) {
                System.out.println(i);
                return;
            }
            count++;
        }
        
        // fallback (though loop always breaks earlier)
        System.out.println(count);
    }
}
