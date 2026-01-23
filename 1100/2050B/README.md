# Problem Number - 2050B Transfusion  
**Problem Link:** [https://codeforces.com/problemset/problem/2050/B](https://codeforces.com/problemset/problem/2050/B)  

---

## Topics
- Implementation  
- Math  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 3 ≤ `n` ≤ 2 × 10⁵ (sum of all n across test cases ≤ 2 × 10⁵)  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to check if it is possible to make all transfusion values equal across odd and even indexed positions (1-based indexing).  
- **Step 1:** Compute the sum of values at odd indices (`sumOdd`) and even indices (`sumEven`).  
- **Step 2:** Compute the number of odd positions (`countOdd`) and even positions (`countEven`).  
- **Step 3:** For the transfusion to be valid:  
  - Both `sumOdd` and `sumEven` must be divisible by their respective counts.  
  - The average value at odd positions (`sumOdd / countOdd`) must equal the average value at even positions (`sumEven / countEven`).  
- **Step 4:** If both conditions hold, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, for scanning the array.  
- **Space Complexity:** `O(n)`, for storing the array.  
