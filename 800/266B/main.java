import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // length of string
        int t = sc.nextInt();   // number of iterations

        String s = sc.next();   // initial string
        char[] arr = s.toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    // swap
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++; // skip next index since it was just swapped
                }
            }
        }

        System.out.println(new String(arr));
    }
}
