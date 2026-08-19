import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            String str = "1" +"0".repeat(a-1);
            String str2 = "1".repeat(b-c+1) + "0".repeat(c-1);
 
            System.out.println(str+" "+str2);
        }
    }
}