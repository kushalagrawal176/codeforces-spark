# Problem Number - 1850D Balanced Round  
**Problem Link:** [https://codeforces.com/problemset/problem/1850/D](https://codeforces.com/problemset/problem/1850/D)  

---

## Topics
- Implementation  
- Greedy  
- Sorting  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `k` ≤ 10⁹  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of elements to remove so that the remaining sequence is **k-balanced**.  
- A sequence is k-balanced if the difference between any two consecutive elements is at most `k`.  
- Steps:  
  1. Sort the array to ensure consecutive differences are easy to check.  
  2. Traverse the sorted array and count the length of the longest subsequence where consecutive differences ≤ `k`.  
  3. The answer is `n - longest subsequence length`, since we remove all other elements.  
- This greedy approach works because sorting ensures that the subsequence with minimal removals is contiguous.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(n)`, for storing the array.  
