#include<bits/stdc++.h>
using namespace std;

int main() 
{
    string a;
    cin>>a;

    int n = a.length();

    int count = (1 << n) - 2;
    int c = 0;

    for(int i = n - 1; i >= 0; i--) 
    {
        if(a[i] == '7')
            c += (1 << (n - i - 1));
    }

    cout<<count + c + 1<<endl;

    return 0;
}