#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin >> n;

    vector<string> names(n);
    vector<int> scores(n);

    for (int i = 0; i < n; i++)
        cin >> names[i] >> scores[i];

    // Map to store cumulative scores
    unordered_map<string, int> totalScores;
    for (int i = 0; i < n; i++)
        totalScores[names[i]] += scores[i];

    // Find maximum score
    int maxScore = INT_MIN;
    for (auto &p : totalScores)
        maxScore = max(maxScore, p.second);

    // Track running scores to determine earliest winner
    unordered_map<string, int> runningScores;
    for (int i = 0; i < n; i++) 
    {
        runningScores[names[i]] += scores[i];
        if (totalScores[names[i]] == maxScore && runningScores[names[i]] >= maxScore) 
        {
            cout << names[i] << "\n";
            break;
        }
    }

    return 0;
}
