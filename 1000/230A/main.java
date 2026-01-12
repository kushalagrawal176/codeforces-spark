import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); // initial strength
        int n = sc.nextInt(); // number of dragons

        // store dragons as pairs (strength, bonus)
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) 
        {
            dragons[i][0] = sc.nextInt(); // dragon strength
            dragons[i][1] = sc.nextInt(); // bonus after defeating
        }

        // sort dragons by strength
        Arrays.sort(dragons, new Comparator<int[]>(){
            public int compare(int[] d1, int[] d2) {
                return Integer.compare(d1[0], d2[0]);
            }
        });

        boolean possible = true;
        for (int i = 0; i < n; i++) 
        {
            if (dragons[i][0] < s)
                s += dragons[i][1];
            else 
            {
                possible = false;
                break;
            }
        }

        if (possible) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
