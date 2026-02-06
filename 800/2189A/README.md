# Problem Number - 2189A Table with Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/2189/A](https://codeforces.com/problemset/problem/2189/A)  

---

## Topics
- Arrays  
- Counting  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 500  
- 2 ≤ `n` ≤ 100  
- 1 ≤ `h`, `l` ≤ 1000  
- 1 ≤ `a[i]` ≤ 1000  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given an array of `n` numbers and two integers `h` and `l`.  
- The task is to count how many numbers fall into two ranges:  
  - `less`: numbers ≤ min(h, l)  
  - `more`: numbers ≤ max(h, l) but greater than min(h, l)  
- The answer is computed as:  **result = (less + min(less, more)) / 2** 
- This formula balances the counts from both ranges to determine the maximum possible valid pairs.  
- The problem reduces to simple counting and applying the given formula.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` per test case to scan and classify elements.  
- **Space Complexity:**  
  - `O(1)`, only constant space used for counters.  
