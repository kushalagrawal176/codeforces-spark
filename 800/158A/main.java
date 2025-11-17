import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of participants
        int k = sc.nextInt();  // position k

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int cutoff = scores[k - 1];  // score of the k-th participant
        int count = 0;

        for (int i = 0; i < n; i++) 
        {
            if (scores[i] >= cutoff && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
