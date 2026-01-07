import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int count0 = 0, count1 = 0;

        for (int i = 0; i < n; i++) 
        {
            if (s.charAt(i) == '0') 
                count0++;
            else 
                count1++;
        }

        // Result is the absolute difference
        System.out.println(Math.abs(count0 - count1));
    }
}
