# Problem Number - 1993B Parity and Sum  

**Problem Link:** [https://codeforces.com/problemset/problem/1993/B](https://codeforces.com/problemset/problem/1993/B)  

---

## Topics
- Implementation  
- Greedy  
- Sorting  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to make all numbers in the array have the **same parity** (all odd or all even) using the minimum number of operations.  
- An operation consists of adding one element to another.  
- Key observations:  
  - If all numbers are already odd, **no operations** are needed.  
  - If all numbers are even, **no operations** are needed.  
  - Otherwise, we need to convert all even numbers to odd numbers.  
- Strategy:  
  - Find the maximum odd number in the array.  
  - Sort the array and iterate through even numbers.  
  - For each even number, add it to the **maximum odd**. This increases the maximum odd and ensures parity conversion.  
  - If an even number is larger than the current maximum odd, we need **one extra operation** to handle it separately.  
- The answer is the count of operations performed on even numbers plus possibly one extra adjustment.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(n)`, for storing the array.  
