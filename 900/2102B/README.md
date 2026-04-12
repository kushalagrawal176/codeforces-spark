# Problem Number - 2102B The Picky Cat

**Problem Link:** [https://codeforces.com/problemset/problem/2102/B](https://codeforces.com/problemset/problem/2102/B)

---

## Topics
- Implementation  
- Sorting  
- Greedy  

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (array size)  
- -10⁶ ≤ `a[i]` ≤ 10⁶ (array elements)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- You are given an array `a` of size `n`. You can flip the sign of any element (including the first one).  
- The task is to determine if the first element (or its negation) can become the **median** of the array.  
- The median is defined as the **⌈n/2⌉-th** smallest element after sorting.  

### Key Observations:
1. The median is determined by the relative position of values.  
2. For the first element `a1`, we can choose either `a1` or `-a1`.  
3. To make `a1` the median, at most half of the elements should be strictly smaller than it.  
4. Thus, count how many elements have absolute value smaller than `|a1|`.  
   - If this count ≤ n/2, then `a1` can be the median.  
   - Otherwise, it cannot.  

### Simplified Logic:
- Let `first = |a1|`.  
- Count elements `x` such that `|x| < first`.  
- If `count ≤ n/2`, print **YES**; else print **NO**.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (linear scan of the array).  
- **Space Complexity:** `O(1)`, only counters and variables used.  