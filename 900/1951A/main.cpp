#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        int n;
        cin>>n;
        string s;
        cin>>s;

        int count = 0;
        for(char ch : s) 
        {
            if(ch == '1')
                count++;
        }

        // Equivalent logic to your Java ternary statement
        if(count % 2 == 0) 
        {
            if(count == 2 && s.find("11") != string::npos)
                cout<<"NO\n";
            else
                cout<<"YES\n";
        } 
        else
            cout<<"NO\n";
    }

    return 0;
}