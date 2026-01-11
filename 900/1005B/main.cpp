#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    stack<char> st1;
    stack<char> st2;
    
    string a,b;
    cin>>a;
    cin>>b;
    
    for(int i=0;i<a.length();i++)
        st1.push(a[i]);
    for(int i=0;i<b.length();i++)
        st2.push(b[i]);
        
    int cnt = 0;
    while(st1.size()>0 && st2.size()>0 && st1.top() == st2.top())
    {
        cnt = cnt + 2;
        st1.pop();
        st2.pop();
    }
    
    cout<<a.length()+b.length()-cnt;
    
    return 0;
}