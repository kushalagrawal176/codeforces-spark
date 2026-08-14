#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        string a;
        cin >> a;

        bool all_same = true;
        for(int i=1; i<a.length(); i++)
        {
            if(a[i] != a[0]) 
            {
                all_same = false;
                break;
            }
        }

        if (all_same)
            cout<<a<<"\n";
        else 
        {
            string s = "";
            for(int i=0; i<a.length(); i++)
                s += "01";
            cout<<s<<"\n";
        }
    }

    return 0;
}