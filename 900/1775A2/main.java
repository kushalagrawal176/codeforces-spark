import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            String s = sc.next();
 
            if(s.charAt(1)=='b')
                System.out.println(s.charAt(0)+" "+s.substring(1,s.length()-1)+" "+s.charAt(s.length()-1));
            else
                System.out.println(s.charAt(0)+" "+s.charAt(1)+" "+s.substring(2));
        }
    }
}