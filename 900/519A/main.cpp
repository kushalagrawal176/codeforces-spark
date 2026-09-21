#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int w = 0, b = 0;
    string pieces = "pnbrqk";
    int values[] = {1, 3, 3, 5, 9, 0};

    for(int i=0; i<8; i++) 
    {
        string s;
        cin>>s;

        for(char c : s) 
        {
            char lower_c = tolower(c);
            size_t pos = pieces.find(lower_c);

            if(pos != string::npos) 
            {
                int val = values[pos];
                if (isupper(c))
                    w += val; // Uppercase represents White pieces
                else
                    b += val; // Lowercase represents Black pieces
            }
        }
    }

    if(w > b)
        cout<<"White\n";
    else if(b > w)
        cout<<"Black\n";
    else
        cout<<"Draw\n";

    return 0;
}