import java.util.*;

public class main 
{
    static List<List<Integer>> adj;
    static int[] cats;
    static int n, m, ans = 0;

    static void dfs(int node, int parent, int consecutive) 
    {
        if (cats[node] == 1)
            consecutive++;
        else
            consecutive = 0;

        if (consecutive > m)
            return;

        boolean isLeaf = true;
        for (int neigh : adj.get(node)) 
        {
            if (neigh != parent) 
            {
                isLeaf = false;
                dfs(neigh, node, consecutive);
            }
        }

        if (isLeaf)
            ans++;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        cats = new int[n];
        adj = new ArrayList<>(n);

        for (int i = 0; i < n; i++) 
        {
            cats[i] = sc.nextInt();
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) 
        {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        dfs(0, -1, 0);

        System.out.println(ans);
    }
}
