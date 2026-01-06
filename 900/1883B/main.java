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
            int k = sc.nextInt();
            
            String s = sc.next();
            
            int one = 0;
            int odd = 0;
            
            HashMap<Character,Integer> mp = new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                if(mp.get(s.charAt(i)) == null)
                    mp.put(s.charAt(i), 1);
                else
                    mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
            }
            
            int delete = 0;
            for(int i=0;i<s.length();i++)
            {
                if(mp.get(s.charAt(i)) == 1)
                {
                    if(odd > 0)
                    {
                        if(one > 0)
                            delete += 2;
                        else
                            delete += 1;
                        one = 0;
                    }
                    else
                    {
                        if(one > 0)
                            delete += 1;
                        else
                            one = 1;
                    }
                }
                else if(mp.get(s.charAt(i))%2 == 1)
                {
                    if(one == 1)
                    {
                        one = 0;
                        delete += 1;
                        odd = mp.get(s.charAt(i));
                    }
                    else
                    {
                        if(odd > 0)
                        {
                            delete += Math.min(mp.get(s.charAt(i)), odd);
                            odd = Math.max(mp.get(s.charAt(i)), odd);
                        }
                        else
                            odd = mp.get(s.charAt(i));
                    }
                }
                else
                {}
                mp.put(s.charAt(i), 0);
            }
            
            if(delete <= k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}