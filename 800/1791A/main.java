import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) 
        {
            char ch = sc.next().charAt(0);

            // Check if the character belongs to "codeforces"
            if (ch == 'c' || ch == 'o' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'r' || ch == 's') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
