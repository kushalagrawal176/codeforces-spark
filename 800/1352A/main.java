import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0)
        {
            int n = sc.nextInt();
            
            int cnt = 0;
            int i = 0;
            
            ArrayList<Integer> a = new ArrayList<Integer>();
            
            while(n!=0)
            {
                if(n%10 != 0)
                {
                    cnt++;
                    a.add(n%10 * (int)Math.pow(10,i));
                }
                i++;
                n = n/10;
            }
            
            System.out.println(cnt);
            
            for(int j=0;j<a.size();j++)
                System.out.print(a.get(j)+" ");
            System.out.println();
            
            t--;
        }
    }
}