import java.util.*;

public class main
{
    // Function to compute the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static long gcd(long x, long y)
    {
        while (y != 0) 
        {
            long temp = y;
            y = x % y;  // remainder becomes new y
            x = temp;   // previous y becomes new x
        }
        return x;  // when y becomes 0, x is the GCD
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while(t-- > 0)
        {
            long n = sc.nextLong(); // upper limit (numbers from 1 to n)
            long x = sc.nextLong(); // divisor for first set
            long y = sc.nextLong(); // divisor for second set
            
            // Compute Least Common Multiple (LCM) using formula: LCM(a,b) = (a*b)/GCD(a,b)
            long lcm = (x*y) / (long)(gcd(x, y));
            
            // Count how many numbers up to n are divisible by x, y, and both (LCM)
            long n1 = n/x;   // count divisible by x
            long n2 = n/y;   // count divisible by y
            long n3 = n/lcm; // count divisible by both x and y
            
            // Remove overlap (numbers divisible by both x and y)
            n1 -= n3;
            n2 -= n3;
            
            // sum1: contribution of numbers divisible by x but not y
            // Formula: sum of largest n1 numbers from 1..n
            // (n1*(n1+1))/2 gives sum of first n1 natural numbers
            // (n-n1)*n1 adds the offset to shift them to the largest values
            long sum1 = (n1*(n1+1))/2 + (n-n1)*n1;
            
            // sum2: contribution of numbers divisible by y but not x
            // Simply sum of first n2 natural numbers
            long sum2 = (n2*(n2+1))/2;
            
            // Final answer: maximize sum1 (largest values) and minimize sum2 (smallest values)
            System.out.println(sum1 - sum2);
        }
    }
}
