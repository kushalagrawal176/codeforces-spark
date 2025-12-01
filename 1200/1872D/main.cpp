#include <bits/stdc++.h>
using namespace std;

// Function to compute the Greatest Common Divisor (GCD) using Euclidean algorithm
long long gcd(long long x, long long y) 
{
    while (y != 0) 
    {
        long long temp = y;
        y = x % y;  // remainder becomes new y
        x = temp;   // previous y becomes new x
    }
    return x;  // when y becomes 0, x is the GCD
}

int main() 
{
    int t;
    cin >> t;  // number of test cases

    while (t--) 
    {
        long long n, x, y;
        cin >> n >> x >> y;

        // Compute Least Common Multiple (LCM) using formula: LCM(a,b) = (a*b)/GCD(a,b)
        long long lcm = (x * y) / gcd(x, y);

        // Count how many numbers up to n are divisible by x, y, and both (LCM)
        long long n1 = n / x;   // count divisible by x
        long long n2 = n / y;   // count divisible by y
        long long n3 = n / lcm; // count divisible by both x and y

        // Remove overlap (numbers divisible by both x and y)
        n1 -= n3;
        n2 -= n3;

        // sum1: contribution of numbers divisible by x but not y
        // Formula: sum of largest n1 numbers from 1..n
        // (n1*(n1+1))/2 gives sum of first n1 natural numbers
        // (n-n1)*n1 adds the offset to shift them to the largest values
        long long sum1 = (n1 * (n1 + 1)) / 2 + (n - n1) * n1;

        // sum2: contribution of numbers divisible by y but not x
        // Simply sum of first n2 natural numbers
        long long sum2 = (n2 * (n2 + 1)) / 2;

        // Final answer: maximize sum1 (largest values) and minimize sum2 (smallest values)
        cout << (sum1 - sum2) << "\n";
    }

    return 0;
}
