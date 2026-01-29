# Problem Number - 1497B M-arrays  

**Problem Link:** [https://codeforces.com/problemset/problem/1497/B](https://codeforces.com/problemset/problem/1497/B)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `m` ≤ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Sum of n across all test cases ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We need to partition the array into the minimum number of groups such that the sum of elements in each group is divisible by `m`.  
- Key observation: Only the **remainders modulo m** matter.  
- For each element `a[i]`, compute `a[i] % m`.  
- Maintain a frequency count of each remainder.  
- Strategy:  
  - If there are elements with remainder `0`, they can all form one group.  
  - For each remainder `i`, pair it with remainder `m - i`.  
    - If both have counts, they can be grouped together.  
    - If the difference in counts is ≤ 1, only one group is needed.  
    - Otherwise, the excess elements contribute additional groups equal to the difference.  
  - Special case: when `i == m - i` (i.e., `m` is even and `i = m/2`), all such elements form one group.  

## Time and Space Complexity
- **Time Complexity:** `O(n + m)`, since we count remainders and process pairs.  
- **Space Complexity:** `O(m)`, for storing remainder counts.  
