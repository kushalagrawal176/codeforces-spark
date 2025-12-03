import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) 
        {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            
            // Construct the new string using the first character of each
            String temp = "";
            temp += s1.charAt(0);
            temp += s2.charAt(0);
            temp += s3.charAt(0);
            
            System.out.println(temp);
        }
    }
}
