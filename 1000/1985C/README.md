# Problem Number - 1985C Good Prefixes  

**Problem Link:** [https://codeforces.com/problemset/problem/1985/C](https://codeforces.com/problemset/problem/1985/C)  

---

## Topics  
- Implementation  
- Prefix Sums  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (length of the array)  
- 0 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Sum of all `n` across test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are asked to count the number of prefixes of the array that are "good".  
- A prefix is considered good if the sum of its elements equals **twice the maximum element** in that prefix.  
- To solve this:  
  - Maintain a running sum of elements.  
  - Track the maximum element seen so far.  
  - For each prefix, check if `sum == 2 * max`.  
  - If true, increment the counter.  
- At the end of each test case, output the count of good prefixes.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we process each element once.  
- **Space Complexity:** `O(1)`, aside from storing the array.  
