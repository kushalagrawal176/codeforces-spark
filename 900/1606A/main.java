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
            
            for(int i=0;i<s.length()-1;i++)
                System.out.print(s.charAt(i));
                
            System.out.println(s.charAt(0));
        }
    }
}