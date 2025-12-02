# Problem Number - 1996A Legs
**Problem Link:** [https://codeforces.com/problemset/problem/1996/A](https://codeforces.com/problemset/problem/1996/A)

---

## Topics
- Implementation
- Math
- Binary Search

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 2.1000  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of animals present in the farm.
- Farmer John counted `n` legs and it is known that farm contains chicken and cows only.
- To minimize the number of animals:
  - First, divide `n` by 4 to count how many groups of 4 can be formed.
  - If there are 2 leftover elements (`n % 4 == 2`), they can form one additional group of size 2.
- The formula for the answer is:  
  **operations = (n / 4) + (n % 4) / 2**

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space is used.
