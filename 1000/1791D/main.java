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
            String s = sc.next();
            
            HashMap<Character, Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(mp.get(s.charAt(i)) == null)
                    mp.put(s.charAt(i), 1);
                else
                    mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
            }
            
            int maxi = mp.size();
            HashMap<Character, Integer> prefix = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(prefix.get(s.charAt(i)) == null)
                    prefix.put(s.charAt(i), 1);
                else
                    prefix.put(s.charAt(i), prefix.get(s.charAt(i))+1);
                
                mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i)) == 0)
                    mp.remove(s.charAt(i));
                
                maxi = Math.max(maxi, prefix.size()+mp.size());
            }
            
            System.out.println(maxi);
        }
    }
}