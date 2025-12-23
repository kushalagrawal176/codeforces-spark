import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String n = sc.next();
            System.out.println((n.length()-1)*9 + n.charAt(0)-'0');
        }
    }
}