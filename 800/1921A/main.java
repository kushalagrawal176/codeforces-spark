import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            int x4 = sc.nextInt();
            int y4 = sc.nextInt();

            int ans = 0;

            // Calculate the area based on the x-coordinates
            // If x1 is equal to x2, then the area is determined by the distance between y1 and y2
            if(x1 == x2)
                ans = Math.abs(y1-y2)*Math.abs(y1-y2);
            // If x1 is equal to x3, then the area is determined by the distance between y1 and y3
            else if(x1 == x3)
                ans = Math.abs(y1-y3)*Math.abs(y1-y3);
            // If x1 is equal to x4, then the area is determined by the distance between y1 and y4
            else if(x1 == x4)
                ans = Math.abs(y1-y4)*Math.abs(y1-y4);

            System.out.println(ans);
        }
    }
}