import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int a = 0; // count of '1'
        int b = 0; // count of '2'
        int c = 0; // count of '3'

        // Count occurrences of 1, 2, 3
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') 
                a++;
            else if (ch == '2') 
                b++;
            else if (ch == '3') 
                c++;
        }

        // Rebuild the string in sorted order
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a; i++) 
            result.append("1+");
        for (int i = 0; i < b; i++) 
            result.append("2+");
        for (int i = 0; i < c; i++) 
            result.append("3+");

        // Remove the trailing '+'
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString());
    }
}