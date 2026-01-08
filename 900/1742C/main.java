import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String ans = "";
            
            for(int i=0;i<8;i++)
            {
                String s = sc.next();
                if(s.equals("RRRRRRRR") == true)
                    ans = "R";
            }
            
            if(ans.equals("R") == true)
                System.out.println("R");
            else
                System.out.println("B");
        }
    }
}