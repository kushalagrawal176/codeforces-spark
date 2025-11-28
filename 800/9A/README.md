# Problem Number - 9A Die Roll  

**Problem Link:** [https://codeforces.com/problemset/problem/9/A](https://codeforces.com/problemset/problem/9/A)  

---

## Topics  
- Probability  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `Y` ≤ 6 (Yakko's die roll)  
- 1 ≤ `W` ≤ 6 (Wakko’s die roll)  
- Time limit per test: 1 seconds  
- Memory limit per test: 64 megabytes  

## Intuition / Approach  
- The problem asks for the probability that the maximum of Yasha’s and Wanda’s rolls (`max(Y, W)`) will be achieved or exceeded when rolling a fair six-sided die.  
- Since the die has values from 1 to 6, the number of favorable outcomes is `(6 - max(Y, W) + 1)`.  
- The total number of possible outcomes is 6.  
- Therefore, the probability is:  

        **Probability:** (6 - max(Y, W) + 1) / 6

- This fraction can be simplified to one of the standard forms: `1/1`, `5/6`, `2/3`, `1/2`, `1/3`, or `1/6`.  
- Steps:  
  1. Read integers `Y` and `W`.  
  2. Compute `d = max(Y, W)`.  
  3. Calculate favorable outcomes as `(6 - d + 1)`.  
  4. Print the simplified fraction corresponding to the probability.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since only a few arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space is used.  
