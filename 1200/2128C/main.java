import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            String ans = "YES";

            long min = (int)1e9;
            for(int i=0;i<n;i++)
            {
                int ele = sc.nextInt();

                if(min*2 <= ele)
                    ans = "NO";
 
                min = Math.min(min, ele);
            }

            System.out.println(ans);
        }
    }
}
