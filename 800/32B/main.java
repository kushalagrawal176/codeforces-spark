import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        String num = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '.')
                num = num + "0";
            else if(s.charAt(i) == '-' && s.charAt(i+1) == '.')
            {
                i++;
                num = num + "1";
            }
            else if(s.charAt(i) == '-' && s.charAt(i+1) == '-')
            {
                i++;
                num = num + "2";
            }
            else
            {}
        }
 
        System.out.println(num);
    }
}