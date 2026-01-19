# Problem Number - 492B Vanya and Lanterns  
**Problem Link:** [https://codeforces.com/problemset/problem/492/B](https://codeforces.com/problemset/problem/492/B)  

---

## Topics
- Implementation  
- Math  
- Sorting  

## Constraints
- 1 ≤ `n` ≤ 1000 (number of lanterns)  
- 1 ≤ `l` ≤ 10⁹ (length of the street)  
- Lantern positions are integers between `0` and `l`  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum radius of light required so that the entire street of length `l` is illuminated.  
- Steps to solve:
  - Sort the lantern positions.  
  - Compute the maximum gap between consecutive lanterns; the required radius must cover half of this gap.  
  - Also consider the distance from the first lantern to the start of the street (0) and from the last lantern to the end of the street (`l`).  
  - The answer is the maximum of these three values.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the lantern positions.  
- **Space Complexity:** `O(n)`, for storing the lantern positions.  
