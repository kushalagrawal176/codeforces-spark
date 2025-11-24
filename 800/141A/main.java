import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        
        Map<Character,Integer> mp = new HashMap<>(); // we can use array of size 26 as well since only lowercase letters are present
        
        for(int i=0;i<a.length();i++)
        {
            if(mp.get(a.charAt(i)) != null)
                mp.put(a.charAt(i), mp.get(a.charAt(i)) + 1);
            else
                mp.put(a.charAt(i), 1);
        }
        for(int i=0;i<b.length();i++)
        {
            if(mp.get(b.charAt(i)) != null)
                mp.put(b.charAt(i), mp.get(b.charAt(i)) + 1);
            else
                mp.put(b.charAt(i), 1);
        }
        
        boolean flag = true;
        
        for(int i=0;i<c.length();i++)
        {
            if(mp.get(c.charAt(i)) != null && mp.get(c.charAt(i)) > 0)
                mp.put(c.charAt(i), mp.get(c.charAt(i)) - 1);
            else
            {
                flag = false;
                break;
            }
        }
        
        for (Map.Entry<Character, Integer> it : mp.entrySet())
        {
            if(it.getValue() > 0)
            {
                flag = false;
                break;
            }
        }
        
        if(flag == true)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}