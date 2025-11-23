import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        Map<Character, Integer> mp = new HashMap<>();
 
        int cnt = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == ',')
            {}
            else
            {
                if(mp.containsKey(s.charAt(i)))
                {}
                else
                {
                    mp.put(s.charAt(i), 1);
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
    }
}