# Problem Number - 766B Mahmoud and a Triangle  

**Problem Link:** [https://codeforces.com/problemset/problem/766/B](https://codeforces.com/problemset/problem/766/B)  

---

## Topics  
- Implementation  
- Sorting  
- Geometry  
- Math
- Number Theory

## Constraints  
- 3 ≤ `n` ≤ 10⁵ (number of segments)  
- 1 ≤ `a[i]` ≤ 10⁹ (length of each segment)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether it is possible to form a non-degenerate triangle using any three of the given segments.  
- A triangle is valid if the sum of the lengths of any two sides is strictly greater than the third side.  
- To check efficiently:  
  - Sort the array of segment lengths.  
  - After sorting, it is sufficient to check consecutive triples `(a[i], a[i+1], a[i+2])`.  
  - If `a[i] + a[i+1] > a[i+2]` for any `i`, then a valid triangle exists.  
- If such a triple is found, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(n)`, for storing the segment lengths.  
