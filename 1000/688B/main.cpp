#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() 
{
    string s;
    cin >> s;

    string ans = s;
    reverse(ans.begin(), ans.end());

    cout << s + ans << endl;

    return 0;
}
