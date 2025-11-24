# Problem Number - 732A Buy a Shovel  
**Problem Link:** [https://codeforces.com/problemset/problem/732/A](https://codeforces.com/problemset/problem/732/A)

---

## Topics
- Implementation  
- Math  

---

## Constraints
- 1 ≤ `k` ≤ 1000  
- 1 ≤ `r` ≤ 9  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem asks for the minimum number of shovels to buy such that the total cost ends with digit `r` or `0`.  
- Let the price of one shovel be `k`.  
- For each integer `i` (number of shovels), compute `k × i`.  
- Check if the last digit of `k × i` is equal to `r` or `0`.  
- The first such `i` is the answer.  

---

## Examples
| Input | Output |
|-------|--------|
| 117 3 | 9      |
| 15 2  | 2      |

---

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since at most 10 iterations are needed (checking last digit cycles every 10).  
- **Space Complexity:** `O(1)`, no extra space is required.  
