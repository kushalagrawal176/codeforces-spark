import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> mp = new HashMap<>();

        int max = 0;
        String ans = "";

        while (n-- > 0) 
        {
            String a = sc.next();

            if (mp.containsKey(a)) 
            {
                mp.put(a, mp.get(a) + 1);
                if (max < mp.get(a)) 
                {
                    max = mp.get(a);
                    ans = a;
                }
            } 
            else 
            {
                mp.put(a, 1);
                if (ans.equals("")) 
                    ans = a;
            }
        }

        System.out.println(ans);
    }
}
