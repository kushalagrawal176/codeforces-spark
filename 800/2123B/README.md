# Problem Number - 2123B Tournament  
**Problem Link:** [https://codeforces.com/problemset/problem/2123/B](https://codeforces.com/problemset/problem/2123/B)  

---

## Topics  
- Implementation  
- Sorting  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- 2 ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `j`, `k` ≤ `n`  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether it is possible for the participant at position `j` to remain in the tournament after reducing the number of participants to exactly `k`.  
- Each participant has a strength value `a[i]`.  
- To check feasibility, we need to determine if the participant `j` can survive after removing `n - k` participants.  

### Key Observations  
1. Let `num = a[j-1]` be the strength of the participant at position `j`.  
2. After sorting the array, we find the position of `num`.  
3. The maximum number of participants that can be removed while still keeping `num` is calculated based on its position in the sorted array.  
   - If `num` is not the strongest, then `max_remove = i + (n - i - 1) - 1`.  
   - If `num` is the strongest, we can remove one extra, so `max_remove++`.  
4. If `max_remove >= (n - k)`, then it is possible to keep participant `j`. Otherwise, it is not.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(n)`, for storing the array of strengths.  
