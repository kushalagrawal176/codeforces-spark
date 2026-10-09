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
            boolean isSymm = false;
 
            for(int i=0;i<n;i++) 
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
 
                if(c == b)
                    isSymm = true;
            }
 
            System.out.println(m%2 == 1 ? "NO" : isSymm ? "YES" : "NO");
        }
    }
}