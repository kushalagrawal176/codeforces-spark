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

        stack<int> st;
        long long cost = 0;

        for(int i=0; i<n; i++) 
        {
            if(s[i] == '(') 
                st.push(i);
            else if(s[i] == '_') 
            {
                if(!st.empty()) 
                {
                    cost += i - st.top();
                    st.pop();
                }
                else
                    st.push(i);
            } 
            else // s[i] == ')'
            {
                cost += i - st.top();
                st.pop();
            }
        }

        cout<<cost<<"\n";
    }

    return 0;
}