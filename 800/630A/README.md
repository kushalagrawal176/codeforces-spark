# Problem Number - 630A Again Twenty Five!  
**Problem Link:** [https://codeforces.com/problemset/problem/630/A](https://codeforces.com/problemset/problem/630/A)

---

## Topics
- Implementation  
- Math  

---

## Constraints
- 2 ≤ `n` ≤ 2 × 10^18  
- Time limit per test: 0.5 seconds  
- Memory limit: 64 megabytes  

---

## Intuition / Approach
- The problem asks us to compute the last two digits of 5^n.  
- Observation:  
  - For any n ≥ 2, 5^n always ends with 25.  
  - For n = 1, 5^1 = 5, which ends with 5.  
- Therefore:  
  - If n = 1 → Output: 5  
  - Otherwise → Output: 25  

---

## Examples
| Input | Output |
|-------|--------|
| 1     | 5      |
| 2     | 25     |
| 10    | 25     |

---

## Time and Space Complexity
- Time Complexity: `O(1)`, since only a simple conditional check is required.  
- Space Complexity: `O(1)`, no extra space is needed.  
