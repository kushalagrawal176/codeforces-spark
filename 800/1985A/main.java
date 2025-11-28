import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            
            // swap the first characters
            char temp = a.charAt(0);
            a = b.charAt(0) + a.substring(1);
            b = temp + b.substring(1);
            
            System.out.println(a + " " + b);
        }
        
        sc.close();
    }
}
