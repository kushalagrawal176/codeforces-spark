import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        String s = sc.next();
        
        long sum = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
                sum += a;
            if(s.charAt(i) == '2')
                sum += b;
            if(s.charAt(i) == '3')
                sum += c;
            if(s.charAt(i) == '4')
                sum += d;
        }
        
        System.out.println(sum);
    }
}