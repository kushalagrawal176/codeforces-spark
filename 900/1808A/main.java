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
            
            int g = 1, sum = -1;
            for(int i=n; i<=m; i++) 
            {
                int max = 0, min = 9;
                int j = i;
                
                while(j > 0)
                {
                    int r = j%10;
                    max = Math.max(max, r);
                    min = Math.min(min, r);
                    j = j/10;
                }
            
                int a;
                a = max-min;
 
                if(a > sum)
                {
                    sum = a;
                    g = i;
                }
 
                if(sum == 9)
                    break;
            }
            
            System.out.println(g);
        }
    }
}
