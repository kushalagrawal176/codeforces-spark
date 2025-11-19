# Problem Number - 546A Soldier and Bananas  

**Problem Link:** [https://codeforces.com/problemset/problem/546/A](https://codeforces.com/problemset/problem/546/A)  

---

## Topics
- Implementation  
- Math  
- Greedy  

---

## Constraints
- 1 ≤ `k, w` ≤ 1000  
- 0 ≤ `n` ≤ 10^9
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The soldier wants to buy `w` bananas.  
- The cost of the `i`-th banana is `i × k`, where `k` is the cost of the first banana.  
- Therefore, the total cost is:  
  

`cost = k × (1 + 2 + 3 + ... + w) = k × w(w+1)/2`


  
- The soldier initially has `n` dollars.  
- If the total cost is greater than `n`, he must borrow the difference.  
- Otherwise, he doesn’t need to borrow any money.  

### Approach:
- Compute the total cost using the formula.  
- Subtract the soldier’s initial money `n` from the total cost.  
- If the result is positive, that’s the amount he needs to borrow.  
- If the result is negative or zero, print `0`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since the formula directly computes the total cost.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  
