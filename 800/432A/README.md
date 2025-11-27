# Problem Number - 432A Choosing Teams  
**Problem Link:** [https://codeforces.com/problemset/problem/432/A](https://codeforces.com/problemset/problem/432/A)  

---

## Topics  
- Implementation  
- Greedy  
- Math  

## Constraints  
- 1 ≤ `n` ≤ 2000 (number of students)  
- 1 ≤ `k` ≤ 5 (maximum number of contests a student can participate in)  
- 0 ≤ `y[i]` ≤ 5 (number of contests each student has already participated in)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to form the maximum number of teams, each consisting of **3 students**, such that all members can participate in one more contest.  
- A student can join a team if `a[i] + k ≤ 5`.  
- Steps to solve:  
  1. Count how many students satisfy the condition `a[i] + k ≤ 5`.  
  2. The maximum number of teams is simply the integer division of this count by 3 (`count / 3`).  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we iterate through all students once.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
