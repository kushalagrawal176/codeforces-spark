import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            String a = sc.next();
            String s = sc.next();
            
            HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
            
            for(int i=1;i<=26;i++)
            {
                mp.put(a.charAt(i-1), i);
            }
            
            int cost = 0;
            int pos = mp.get(s.charAt(0));
            
            for(int i=0;i<s.length();i++)
            {
                cost += Math.abs(mp.get(s.charAt(i)) - pos);
                pos = mp.get(s.charAt(i));
            }
            
            System.out.println(cost);
            
            t--;
        }
    }
}