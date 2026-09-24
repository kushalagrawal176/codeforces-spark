import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Map<String,String> mp = new HashMap<String,String>();
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        for(int i=0;i<n;i++)
        {
            String s1 = sc.next();
            String s2 = sc.next();
 
            s2 += ";";
            mp.put(s2,s1);
        }
 
        for(int i=0;i<m;i++)
        {
            String s1 = sc.next();
            String s2 = sc.next();
 
            System.out.println(s1 + " "+s2 + " #" + mp.get(s2));
        }
    }
}