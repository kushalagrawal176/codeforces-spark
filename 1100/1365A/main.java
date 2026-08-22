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
            int m = sc.nextInt();
 
            Set<Integer> r = new HashSet<>();
            Set<Integer> c = new HashSet<>();

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int val = sc.nextInt();

                    if(val == 1)
                    {
                        r.add(i);
                        c.add(j);
                    }
                }
            }
 
            int ur = n-r.size();
            int uc = m-c.size();
 
            int ans = Math.min(ur, uc);
            System.out.println(ans%2!=0 ? "Ashish":"Vivek");
        }
    }
}