# Problem Number - 489C Given Length and Sum of Digits...  
**Problem Link:** [https://codeforces.com/problemset/problem/489/C](https://codeforces.com/problemset/problem/489/C)  

---

## Topics
- Greedy  
- Implementation  
- Math  

## Constraints
- 1 ≤ `m` ≤ 100  
- 0 ≤ `s` ≤ 900  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to construct the **smallest** and **largest** numbers of length `m` whose digits sum to `s`.  
- Key observations:  
  - If `s == 0` and `m > 1`, or if `m * 9 < s`, then it is impossible to form such a number.  
  - To form the **largest number**, we greedily assign the maximum possible digit (`≤ 9`) from left to right until the sum is exhausted.  
  - To form the **smallest number**, we need to avoid leading zeros:  
    - Reserve 1 unit of sum for the first digit.  
    - Fill the remaining digits from right to left with as many 9s as possible.  
    - Finally, place the reserved unit at the front.  
- This ensures both numbers satisfy the digit sum constraint while respecting the length `m`.  

## Time and Space Complexity
- **Time Complexity:** `O(m)`, since we iterate through the digits once to construct both numbers.  
- **Space Complexity:** `O(m)`, for storing the resulting strings.  
