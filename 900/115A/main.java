import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        
        for (int i = 0; i <= n; i++)
            adjList.add(new ArrayList<>());
        
        for (int i = 1; i <= n; i++) 
        {
            int a = sc.nextInt();
            if (a == -1) 
                continue;

            adjList.get(a).add(i);
        }
        
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) 
        {
            if (adjList.get(i).isEmpty()) continue;
            
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            int c = 0;
            
            while (!q.isEmpty()) 
            {
                int s = q.size();
                c++;
                
                for (int j = 0; j < s; j++) 
                {
                    int node = q.poll();

                    for (int child : adjList.get(node))
                        q.add(child);
                }
            }
            
            cnt = Math.max(cnt, c);
        }
        
        if (cnt == 0) 
            cnt = 1;
        
        System.out.println(cnt);
    }
}
