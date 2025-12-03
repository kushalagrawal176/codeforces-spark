#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin >> t;
    
    while(t-- > 0) 
    {
        int n;
        string s;
        cin >> n >> s;
        
        int cnt = 0;
        
        // Check for three consecutive dots
        bool has_three_dots = false;
        for(int i = 0; i < n-2; i++) 
        {
            if(s[i] == '.' && s[i+1] == '.' && s[i+2] == '.') 
            {
                cnt = 2;
                has_three_dots = true;
                break;
            }
        }
        
        if(has_three_dots) 
        {
            cout << cnt << endl;
        } 
        else 
        {
            // Count individual dots
            for(int i = 0; i < n; i++) 
            {
                if(s[i] == '.') 
                {
                    cnt++;
                }
            }
            cout << cnt << endl;
        }
    }
    
    return 0;
}
