# Problem Number - 231A Team  

**Problem Link:** [https://codeforces.com/problemset/problem/231/A](https://codeforces.com/problemset/problem/231/A)  

---

## Topics
- Implementation
- Greedy
- Basic Logic

## Constraints
- 1 ≤ n ≤ 1000 (number of problems)
- Each input line contains three integers (0 or 1), representing whether Petya, Vasya, and Tonya are confident about solving the problem.
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes three friends deciding whether to solve a problem.  
- For each problem, if at least **two out of three friends** are confident (i.e., their input is `1`), then the team will solve that problem.  
- So the task reduces to checking whether the sum of the three integers (`a + b + c`) is at least 2.  
- Count the number of problems that satisfy this condition.  

### Steps:
1. Read the number of problems `n`.
2. For each problem, read three integers (`a, b, c`).
3. If `a + b + c >= 2`, increment the counter.
4. Print the final counter as the number of problems the team will solve.

## Time and Space Complexity
- **Time Complexity:** O(t), since we check each problem once.  
- **Space Complexity:** O(1), only a counter variable is needed.  
