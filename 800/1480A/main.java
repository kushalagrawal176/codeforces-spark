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
            
            int turn = 1;
            
            for(int i=0;i<s.length();i++)
            {
                if(turn == 1)
                {
                    if(s.charAt(i) == 'a')
                        s = s.substring(0, i) + 'b' + s.substring(i + 1);
                    else
                        s = s.substring(0, i) + 'a' + s.substring(i + 1);
                }
                else
                {
                    if(s.charAt(i) == 'z')
                        s = s.substring(0, i) + 'y' + s.substring(i + 1);
                    else
                        s = s.substring(0, i) + 'z' + s.substring(i + 1);
                }
                
                turn = (turn^(1^2));
            }
            
            System.out.println(s);
        }
    }
}