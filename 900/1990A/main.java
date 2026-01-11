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
            int arr[] = new int[51];
            
            for(int i=0;i<n;i++)
                arr[sc.nextInt()] += 1;
                
            int i=50;
            while(i >= 0 && (arr[i]&1) == 0)
                i -=1;
                
            System.out.println(i>=0?"YES":"NO");
        }
    }
}