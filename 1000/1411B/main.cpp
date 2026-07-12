#include<bits/stdc++.h>
using namespace std;

// Helper function to check if a number is "fair"
bool isFair(long long n) 
{
    long long temp = n;
    while(temp > 0) 
    {
        int digit = temp % 10;
        // If the digit is not 0, it must divide the original number n
        if(digit != 0 && n % digit != 0)
            return false;

        temp /= 10;
    }

    return true;
}

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long n;
        cin >> n;

        // Keep incrementing until we find a fair number
        while(!isFair(n))
            n++;

        cout << n << "\n";
    }

    return 0;
}