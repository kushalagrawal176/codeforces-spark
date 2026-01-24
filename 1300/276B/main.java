import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int even = 0;
        int odd = 0;
        
        HashMap<Character, Integer> mp = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(mp.get(s.charAt(i)) == null)
                mp.put(s.charAt(i), 1);
            else
                mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(mp.get(s.charAt(i)) > 0)
            {
                if(mp.get(s.charAt(i)) % 2 == 0)
                    even++;
                else
                    odd++;
                mp.put(s.charAt(i), 0);
            }
        }
        
        if(odd > 0)
            odd--;
        
        if(odd%2 == 0)
            System.out.println("First");
        else
            System.out.println("Second");
    }
}