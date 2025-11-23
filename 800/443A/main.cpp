#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    getline(cin, s);  // read the whole line including spaces and braces
    
    set<char> st;     // to store unique characters
    
    for (int i = 0; i < (int)s.size(); i++) {
        char ch = s[i];
        if (ch == '{' || ch == '}' || ch == ',' || ch == ' ')
            continue; // skip non-letter characters
        st.insert(ch); // add unique letters
    }
    
    cout << st.size() << endl; // number of distinct letters
    return 0;
}
