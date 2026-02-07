import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        boolean flag = false;
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) == '0' && flag == false)
            {
                flag = true;
                continue;
            }
            
            System.out.print(s.charAt(i));
        }
        
        if(flag == true)
            System.out.print(s.charAt(s.length()-1));
    }
}