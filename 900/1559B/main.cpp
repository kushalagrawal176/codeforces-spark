#include<bits/stdc++.h>
using namespace std;

// Helper function to replace all occurrences of a substring
void replaceAll(string& str, const string& from, const string& to) 
{
    if(from.empty()) 
        return;

    size_t start_pos = 0;

    while((start_pos = str.find(from, start_pos)) != string::npos) 
    {
        str.replace(start_pos, from.length(), to);
        start_pos += to.length(); 
    }
}

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

        auto contains = [](const string& str, const string& sub) {
            return str.find(sub) != string::npos;
        };

        while(contains(s, "?") && (contains(s, "R") || contains(s, "B"))) 
        {
            replaceAll(s, "?R?", "BRB");
            replaceAll(s, "?B?", "RBR");
            replaceAll(s, "?B", "RB");
            replaceAll(s, "B?", "BR");
            replaceAll(s, "?R", "BR");
            replaceAll(s, "R?", "RB");
        }

        replaceAll(s, "??", "BR");
        replaceAll(s, "?", "B");

        cout<< s << "\n";
    }

    return 0;
}