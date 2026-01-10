import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[][] = new int[5][5];
        int b[][] = new int[5][5];
        
        for(int i=1;i<4;i++)
        {
            for(int j=1;j<4;j++)
            {
                a[i][j] = 1;
                b[i][j] = sc.nextInt();
            }
        }
        
        for(int i=1;i<4;i++)
        {
            for(int j=1;j<4;j++)
            {
                if((b[i][j] & 1) == 0)
                    continue;
                
                a[i][j] = (a[i][j] ^ (1^0));
                a[i-1][j] = (a[i-1][j] ^ (1^0));
                a[i+1][j] = (a[i+1][j] ^ (1^0));
                a[i][j-1] = (a[i][j-1] ^ (1^0));
                a[i][j+1] = (a[i][j+1] ^ (1^0));
            }
        }
        
        for(int i=1;i<4;i++)
        {
            for(int j=1;j<4;j++)
                System.out.print(a[i][j]);
                
            System.out.println();
        }
    }
}