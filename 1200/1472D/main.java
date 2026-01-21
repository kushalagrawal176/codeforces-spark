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
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            long a = 0;
            long b = 0;
            Boolean turn = true;
            
            for(int i=0;i<n;i++)
                arr.add(sc.nextInt());
            
            arr.sort(null);
            
            for(int i=n-1;i>=0;i--)
            {
                if(turn)
                {
                    turn = false;
                    if(arr.get(i)%2 == 0)
                        a += arr.get(i);
                }
                else
                {
                    turn = true;
                    if(arr.get(i)%2 == 1)
                        b += arr.get(i);
                }
            }
            
            if(a>b)
                System.out.println("Alice");
            else if(b>a)
                System.out.println("Bob");
            else
                System.out.println("Tie");
        }
    }
}