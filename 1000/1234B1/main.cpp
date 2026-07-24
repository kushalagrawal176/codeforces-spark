#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n, k;
    cin >> n >> k;

    deque<int> dq;
    unordered_set<int> present;

    for(int i=0; i<n; i++) 
    {
        int id;
        cin >> id;

        // If the ID is not currently on the screen
        if(present.find(id) == present.end()) 
        {
            // If screen display limit is reached, remove the last (oldest) element
            if(dq.size() == k) 
            {
                int last = dq.back();
                dq.pop_back();
                present.erase(last);
            }

            // Insert new ID at the front
            dq.push_front(id);
            present.insert(id);
        }
    }

    // Output result
    cout << dq.size() << "\n";
    for (int i = 0; i < dq.size(); i++)
        cout << dq[i] << (i == dq.size() - 1 ? "" : " ");
    cout << "\n";

    return 0;
}