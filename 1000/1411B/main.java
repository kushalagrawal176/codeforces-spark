import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            for(;;)
            {
                String s = Long.toString(n);
                boolean flag = true;
 
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i) != '0' && n%(s.charAt(i)-'0') != 0)
                    {
                        flag = false;
                        break;
                    }
                }
                
                if(flag == true)
                    break;
                
                n++;
            }
            
            System.out.println(n);
        }
    }
}