import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) 
        {
            int row = sc.nextInt();
            int col = sc.nextInt();

            for(int i=0; i<row; i++) 
            {
                for(int j=0; j<col; j++)
                    System.out.print(((i+1)/2 + (j+1)/2)%2 + " ");
                System.out.println();
            }
        }
    }
}