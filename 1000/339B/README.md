# Problem Number - 339B Xenia and Ringroad  
**Problem Link:** [https://codeforces.com/problemset/problem/339/B](https://codeforces.com/problemset/problem/339/B)  

---

## Topics  
- Implementation  
- Simulation  
- Greedy  

## Constraints  
- 2 ≤ `n` ≤ 10⁵ (number of houses)  
- 1 ≤ `m` ≤ 10⁵ (number of tasks)  
- 1 ≤ `aᵢ` ≤ `n` (house number for each task)  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- Xenia lives in a circular city with `n` houses numbered from 1 to `n`. She starts at house 1 and must complete `m` tasks in order, each located at house `a[i]`.  
- Moving is only allowed **clockwise** around the ring.  
- For each task:  
  - If the next house `a[i]` is **ahead** of the current house, simply move forward (`a[i] - a[i-1]`).  
  - If the next house `a[i]` is **behind** the current house, Xenia must wrap around the ring (`n - (a[i-1] - a[i])`).  
- The total time is the sum of all moves, starting from house 1 to the first task.  
- Finally, subtract 1 because the initial position at house 1 is counted as step 1.  

This direct simulation approach works efficiently within the given constraints.  

## Time and Space Complexity  
- **Time Complexity:** `O(m)`, since we process each task once.  
- **Space Complexity:** `O(m)`, for storing the task list.  
