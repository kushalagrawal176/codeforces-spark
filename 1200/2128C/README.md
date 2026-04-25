# Problem Number - 2128C Leftmost Below

**Problem Link:** [https://codeforces.com/problemset/problem/2128/C](https://codeforces.com/problemset/problem/2128/C)

---

## Topics
- Greedy
- Arrays
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 * 10⁵ (array length per test case)  
- 1 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Sum of `n` across all test cases ≤ 2 * 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the given array satisfies the condition that **no element is at least twice the minimum element seen so far** when traversed from left to right.
- We maintain a running minimum (`minVal`) while iterating through the array.
- For each element `ele`, check if `ele >= 2 * minVal`.  
  - If true, the condition is violated → answer is `"NO"`.  
  - Otherwise, continue and update `minVal = min(minVal, ele)`.
- If the entire array is processed without violation, the answer is `"YES"`.

This greedy approach works because the leftmost minimum element dictates the threshold for all subsequent elements. Once a violation occurs, it cannot be fixed by later elements.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(1)`, only constant extra space is used for tracking the minimum and the answer.
