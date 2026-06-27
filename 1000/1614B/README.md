# Problem Number - 1614B Divan and a New Project  
**Problem Link:** [https://codeforces.com/problemset/problem/1614/B](https://codeforces.com/problemset/problem/1614/B)  

---

## Topics
- Greedy 
- Sorting
- Implementation

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 0 ≤ `aᵢ` ≤ 10⁶  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to assign coordinates to projects such that the **total inconvenience** is minimized.  
- Inconvenience is defined as the sum of `2 × distance × importance` for each project.  
- To minimize the total, the most important projects should be placed closest to the origin (coordinate 0).  
- Strategy:  
  - Sort projects by importance in descending order.  
  - Place them alternately on the left and right side of the origin, starting with the right side.  
  - This ensures symmetry and minimizes the weighted distance.  
- Calculation:  
  - Maintain an index counter for distance from the origin.  
  - Assign coordinates as `+index` and `-index` alternately.  
  - Accumulate the total inconvenience as `2 × index × importance`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the projects by importance.  
- **Space Complexity:** `O(n)`, for storing coordinates and project data.  