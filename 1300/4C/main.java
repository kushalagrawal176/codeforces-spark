import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) 
        {
            String s = sc.next();

            map.put(s, map.getOrDefault(s, 0) + 1);

            if (map.get(s) > 1)
                System.out.println(s + (map.get(s) - 1));
            else
                System.out.println("OK");
        }
    }
}
