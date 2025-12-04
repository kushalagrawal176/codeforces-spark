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
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            ArrayList<Integer> b = new ArrayList<>();
            b.add(a[0]);
            
            for(int i=1;i<n;i++)
            {
                if(a[i-1] <= a[i])
                    b.add(a[i]);
                else
                {
                    b.add(a[i]);
                    b.add(a[i]);
                }
            }
            
            System.out.println(b.size());
            
            for(int i=0;i<b.size();i++)
                System.out.print(b.get(i)+" ");
            System.out.println();
        }
    }
}