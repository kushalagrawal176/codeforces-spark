import java.util.*;

public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        ans.append(s);

        System.out.println(s + ans.reverse());
    }
}