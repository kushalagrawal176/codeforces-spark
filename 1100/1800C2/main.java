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
            
            long sum = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(a > 0)
                    pq.add(a);
                else
                {
                    if(pq.size() > 0)
                        sum += pq.poll();
                }
            }
            
            System.out.println(sum);
        }
    }
}