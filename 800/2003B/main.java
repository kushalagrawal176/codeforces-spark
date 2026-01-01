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
            ArrayList<Integer> a = new ArrayList<>();
            
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            
            a.sort(null);
            
            System.out.println(a.get(n/2));
        }
    }
}