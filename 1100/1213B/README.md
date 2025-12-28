# Problem Number - 1213B Bad Prices  
**Problem Link:** [https://codeforces.com/problemset/problem/1213/B](https://codeforces.com/problemset/problem/1213/B)  
---

## Topics
- Implementation
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 1.5 × 10^5 (number of prices per test case)  
- 1 ≤ `a[i]` ≤ 10^6 (price values)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- A price is considered **bad** if there exists a strictly smaller price after it in the sequence.  
- To efficiently check this, we traverse the array from right to left while keeping track of the minimum price seen so far.  
- If the current price is greater than this minimum, it is a bad price.  
- Otherwise, update the minimum with the current price.  
- This greedy approach ensures we only need one pass through the array.  

### Example
For prices `[3, 9, 4, 6, 7, 5]`:  
- Start from the right: minimum = 5.  
- Compare backwards:  
  - 7 > 5 → bad  
  - 6 > 5 → bad  
  - 4 ≤ 5 → update minimum = 4  
  - 9 > 4 → bad  
  - 3 ≤ 4 → update minimum = 3  
- Total bad prices = 3.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the array once.  
- **Space Complexity:** `O(1)`, only a counter and minimum tracker are used.  
