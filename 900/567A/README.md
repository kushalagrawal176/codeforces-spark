# Problem Number - 567A Lineland Mail  
**Problem Link:** [https://codeforces.com/problemset/problem/567/A](https://codeforces.com/problemset/problem/567/A)  
---

## Topics
- Implementation  
- Greedy  

## Constraints
- 2 ≤ `n` ≤ 10⁵  
- -10⁹ ≤ `a[i]` ≤ 10⁹ 
- Time limit per test: 3 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Lineland is represented as a straight line with `n` cities located at positions `a[i]`.  
- For each city, we need to calculate:  
  - **Minimum distance** to another city (closest neighbor).  
  - **Maximum distance** to another city (farthest city).  
- Since the cities are given in sorted order (or can be sorted), the closest neighbor of city `i` is either `a[i-1]` or `a[i+1]`.  
- The farthest city is always one of the endpoints: `a[0]` or `a[n-1]`.  
- Special handling is required for the first and last city:  
  - First city only has `a[1]` as neighbor.  
  - Last city only has `a[n-2]` as neighbor.  
- Print the minimum and maximum distances for each city accordingly.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we only iterate through the cities once.  
- **Space Complexity:** `O(n)`, for storing the city positions.  
