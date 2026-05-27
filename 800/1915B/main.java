import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
 
            char ans = 'A';
            String f = a;
            
            if(a.contains("?") == true)
                f = a;
            else if(b.contains("?") == true)
                f = b;
            else
                f = c;
 
            int char_a = 0;
            int char_b = 0;
            int char_c = 0;
 
            if(f.charAt(0) == 'A' || f.charAt(1) == 'A' || f.charAt(2) == 'A')
                char_a++;
            if(f.charAt(0) == 'B' || f.charAt(1) == 'B' || f.charAt(2) == 'B')
                char_b++;
            if(f.charAt(0) == 'C' || f.charAt(1) == 'C' || f.charAt(2) == 'C')
                char_c++;
            
            if(char_a == 0)
                ans = 'A';
            if(char_b == 0)
                ans = 'B';
            if(char_c == 0)
                ans = 'C';
 
            System.out.println(ans);
        }
    }
}