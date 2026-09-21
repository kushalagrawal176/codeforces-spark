import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int w = 0, b = 0;
 
        for(int i=0; i<8; i++) 
        {
            String s = sc.next();
            for (char c : s.toCharArray()) 
            {
                int v = "pnbrqk".indexOf(Character.toLowerCase(c)) + 1;
                if(v > 0) 
                {
                    int val = new int[]{1,3,3,5,9,0}[v-1];
                    if (Character.isUpperCase(c)) 
                        w += val;
                    else 
                        b += val;
                }
            }
        }
 
        if(w > b) 
            System.out.println("White");
        else if (b > w) 
            System.out.println("Black");
        else 
            System.out.println("Draw");
    }
}