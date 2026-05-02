import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] b = new int[n];
            Map<Integer, List<Integer>> pos = new HashMap<>();

            for (int i = 0; i < n; i++) 
            {
                b[i] = sc.nextInt();
                pos.computeIfAbsent(b[i], k -> new ArrayList<>()).add(i);
            }

            boolean ok = true;
            for (Map.Entry<Integer, List<Integer>> entry : pos.entrySet()) 
            {
                int x = entry.getKey();
                List<Integer> v = entry.getValue();

                if (v.size() % x != 0) 
                {
                    ok = false;
                    break;
                }
            }

            if (!ok) 
            {
                System.out.println(-1);
                continue;
            }

            int[] a = new int[n];
            int current = 1;

            for (Map.Entry<Integer, List<Integer>> entry : pos.entrySet()) 
            {
                int x = entry.getKey();
                List<Integer> v = entry.getValue();

                for (int i = 0; i < v.size(); i += x) 
                {
                    for (int j = 0; j < x; j++) 
                    {
                        a[v.get(i + j)] = current;
                    }

                    current++;
                }
            }

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
}
