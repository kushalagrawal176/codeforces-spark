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
            
            int o = 0;
            int z = 0;
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '0')
                    z++;
                else
                    o++;
            }
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '0' && o == 0)
                    break;
                if(s.charAt(i) == '1' && z == 0)
                    break;
                
                if(s.charAt(i) == '1')
                    z--;
                else
                    o--;
            }
            
            System.out.println(z+o);
        }
    }
}