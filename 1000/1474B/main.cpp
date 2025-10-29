#include <iostream>
using namespace std;

// Function to check if a number is prime
bool isPrime(int a) 
{
    if (a < 2) 
        return false;  // Numbers less than 2 are not prime

    for (int i = 2; i * i <= a; i++) 
    {
        if (a % i == 0)
            return false;  // If divisible by any number, not prime
    }

    return true;  // Otherwise, it’s prime
}

int main() 
{
    int t; 
    cin >> t;  // Number of test cases

    while (t--) 
    {
        int d;
        cin >> d;  // Read distance value

        int num1 = 0, num2 = 0;

        // Find first prime greater than d
        int a = d + 1;
        while (!isPrime(a))
            a++;
        num1 = a;

        // Find next prime at least d apart from the first
        a = num1 + d;
        while (!isPrime(a))
            a++;
        num2 = a;

        // Output the product of the two primes
        cout << (long long)num1 * num2 << endl;
    }

    return 0;
}
