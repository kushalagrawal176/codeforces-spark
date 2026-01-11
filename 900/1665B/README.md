# Problem Number - 1665B Array Cloning Technique  
**Problem Link:** [https://codeforces.com/problemset/problem/1665/B](https://codeforces.com/problemset/problem/1665/B)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁵  
- -10⁹ ≤ `a[i]` ≤ 10⁹  
- Sum of n across all test cases ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to determine the minimum number of operations required to make all elements of the array equal using the **cloning technique**.  
- **Cloning technique:** In one operation, you can duplicate the entire array and append it, effectively doubling the frequency of each element.  
- Key observation:  
  - The most frequent element (say frequency = `freq`) is the best candidate to clone, since cloning doubles its count.  
  - Remaining elements to be converted = `rem = n - freq`.  
  - Each cloning step increases the count of the most frequent element by `freq`.  
  - After cloning, you can replace mismatched elements one by one.  
- Strategy:  
  1. Find the maximum frequency of any element.  
  2. While there are still elements to convert (`rem > 0`):  
     - Perform one cloning operation (`cnt++`).  
     - If `rem <= freq`, then you can fix all remaining mismatches directly (`cnt += rem`).  
     - Otherwise, fix `freq` mismatches, reduce `rem`, and double `freq`.  
  3. Continue until all elements are equal.  

- Formula/Process:  
  - Initialize `cnt = 0`.  
  - Repeat cloning and fixing until `rem = 0`.  
  - Output `cnt`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, for counting frequencies.  
- **Space Complexity:** `O(n)`, for storing frequencies in a hash map.  
