import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        long t = sc.nextLong();
        
        while (t-- > 0) 
        {
            long n = sc.nextLong();
            long r = sc.nextLong();

            List<long[]> ans=new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                long f = sc.nextLong();
                ans.add(new long[]{f,0});
            }

            for(int i=0;i<n;i++)
                ans.get(i)[1] = sc.nextLong();
            
            ans.sort(Comparator.comparingLong(a->a[1]));
            long rem = n-1;
            long to = r;

            for(int i=0;i<n;i++)
            {
                if(ans.get(i)[1] >= r)
                    break;

                long c = Math.min(rem, ans.get(i)[0]);
                to += c*ans.get(i)[1];
                rem -= c;
            }
            to += r*rem;

            System.out.println(to);
        }
    }
}