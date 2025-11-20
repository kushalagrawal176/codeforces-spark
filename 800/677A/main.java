import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of friends
        int h = sc.nextInt();  // height of the fence

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();  // height of each friend

            if (a > h) {
                cnt += 2;  // friend bends down, takes width 2
            } else {
                cnt += 1;  // friend walks normally, takes width 1
            }
        }

        System.out.println(cnt);
    }
}
