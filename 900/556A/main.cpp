#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    string s;
    cin>>s;
    
    stack<int> st;
    
    for(int i=0;i<n;i++)
    {
        if(st.size() > 0 && st.top() == 1 && s[i] == '0')
            st.pop();
        else if(st.size() > 0 && st.top() == 0 && s[i] == '1')
            st.pop();
        else
        {
            if(s[i] == '0')
                st.push(0);
            else
                st.push(1);
        }
    }
    
    cout<<st.size()<<endl;
    
    return 0;
}