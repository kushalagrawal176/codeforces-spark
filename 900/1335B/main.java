import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
   
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
           
            String s = "";
           
            for(int i=0;i<n;i++)
                s = s + (char)('a'+i%b);
           
            System.out.println(s);
        }
    }
}