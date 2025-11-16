import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // number of elements in arrays a and b
            int k = sc.nextInt(); // maximum number of moves allowed
            
            int a[] = new int[n]; // array a: values added directly to score
            int b[] = new int[n]; // array b: values used when reversing
            
            // read array a
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            // read array b
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();
            
            int i = 0; // index pointer for array a
            int p = 0; // cumulative sum of chosen elements from a
            int c = 0; // maximum value seen so far in b
            int d = 0; // best possible score
            
            // simulate moves: either take from a or use reverse with b
            while(k-- > 0 && i<n)
            {
                p += a[i]; // add next element from a to cumulative sum
                c = Math.max(c, b[i++]); // update max b value seen so far
                // compute best score: sum of chosen a + (remaining moves * best b)
                d = Math.max(d, p + c * k);
            }
            
            // print the maximum score achievable
            System.out.println(d);
        }
    }
}
