import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            String s = sc.next();
            
            if(s.length()%2 != 0)
                System.out.println("NO");
            else
            {
                int ptr = s.length()/2;
                Boolean flag = true;
                for(int i=0;i<ptr;i++)
                {
                    if(s.charAt(i) != s.charAt(i+ptr))
                    {
                        flag = false;
                        break;
                    }
                }
                
                if(flag == true)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            t--;
        }
    }
}