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
            String s = sc.next();

            System.out.println(Math.min(solve(s,'a'), solve(s,'b')));
        }
    }

    public static long solve(String s, char c)
    {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i) == c) 
                a.add(i);
        }

        if(a.size() == 0) 
            return 0;

        int m = a.size()/2;
        long ans = 0;

        for(int i=0;i<a.size();i++) 
            ans += Math.abs(a.get(i) - (a.get(m)+i-m));

        return ans;
    }
}