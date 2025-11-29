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
            
            if(((n*(n+1))/2)%2 != 0)
                System.out.println("NO");
            else
            {
                ArrayList<Integer> a = new ArrayList<Integer>();
                
                for(int i=0;i<n;i=i+2)
                {
                    a.add(i+2);
                }
                int sum = 0;
                for(int i=0;i<n-2;i=i+2)
                {
                    a.add(i+1);
                    sum += i+1;
                }
                
                a.add(n/2*(n/2+1) - sum);
                System.out.println("YES");
                
                for(int i=0;i<n;i++)
                {
                    System.out.print(a.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}