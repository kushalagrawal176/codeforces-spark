#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;

    // Check if "AB" followed by "BA" exists
    if (s.find("AB") != string::npos && s.find("BA", s.find("AB") + 2) != string::npos)
        cout << "YES\n";

    // Or check if "BA" followed by "AB" exists
    else if (s.find("BA") != string::npos && s.find("AB", s.find("BA") + 2) != string::npos)
        cout << "YES\n";
    
    else
        cout << "NO\n";

    return 0;
}
