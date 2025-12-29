# Problem Number - 2004A Closest Point  
**Problem Link:** [https://codeforces.com/problemset/problem/2004/A](https://codeforces.com/problemset/problem/2004/A)  

---

## Topics  
- Implementation  
- Arrays  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 40  
- 1 ≤ `a[i]` ≤ 100 (ascending order)  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach  
- The problem asks whether it is possible to place a new point on the number line such that the minimum distance between any two points is greater than 1.  
- If there are more than 2 points, it is impossible because the new point will always be within distance 1 of some existing point.  
- If there are exactly 2 points, we check the absolute difference between them:  
  - If the difference is greater than 1, then it is possible to place a new point between them, so the answer is **YES**.  
  - Otherwise, the answer is **NO**.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for reading the input. The check itself is O(1).  
- **Space Complexity:** `O(n)`, for storing the points.  
