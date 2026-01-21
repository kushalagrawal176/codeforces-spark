# Problem Number - 1364A XXXXX  

**Problem Link:** [https://codeforces.com/problemset/problem/1364/A](https://codeforces.com/problemset/problem/1364/A)  

---

## Topics
- Number Theory  
- Prefix Sums  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 5  
- 1 ≤ `n` ≤ 10⁵
- 1 ≤ `x` ≤ 10⁴
- Array elements: 0 ≤ `a[i]` ≤ 10⁴
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum length of a subarray whose sum is **not divisible** by `x`.  
- First, compute the prefix sum while reading the array.  
- If the total sum of the array is divisible by `x`, we need to exclude at least one element from either the beginning or the end to make the sum not divisible.  
- While iterating, whenever the prefix sum modulo `x` is non-zero, we update the maximum possible length as either `i+1` (prefix length) or `n-i-1` (suffix length).  
- If no such subarray exists, the answer is `-1`.  

This greedy approach works because removing the smallest prefix or suffix that breaks divisibility gives the longest possible valid subarray.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(1)` if processed directly, or `O(n)` if storing the array.  
