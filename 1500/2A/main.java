import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String [] names = new String[n];
        int [] scores = new int[n];
        
        for(int i=0;i<n;i++)
        {
            names[i] = sc.next();
            scores[i] = sc.nextInt();
        }    
        
        Map<String,Integer> a = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(a.containsKey(names[i]))
            {
                scores[i] += a.get(names[i]);
                a.put(names[i], scores[i]);
            }
            else
            {
                a.put(names[i], scores[i]);
            }
       }
       
       int t = Collections.max(a.values());
       
       for(int i = 0; i < n; i++)
       {
            if(a.get(names[i]) == t && t <= scores[i])
            {
                System.out.println(names[i]);
                break;
            }
       }
    }
}