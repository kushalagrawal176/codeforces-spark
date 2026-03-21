# Problem Number - 2118C Make It Beautiful

**Problem Link:** [https://codeforces.com/problemset/problem/2118/C](https://codeforces.com/problemset/problem/2118/C)

---

## Topics
- Bit Manipulation  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 5000  
- 1 ≤ `n` ≤ 5000 (sum of `n` across all test cases ≤ 5000)  
- 0 ≤ `k` ≤ 10¹⁸  
- 0 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The **beauty of a number** is defined as the number of `1` bits in its binary representation.  
- The **beauty of an array** is the sum of beauties of all its elements.  
- We are allowed to perform at most `k` operations, where each operation **increases** one element of the array by 1.  
- The goal is to maximize the beauty of the array after at most `k` operations.

### Key Observations:
1. Increasing a number by 1 can potentially flip bits in its binary representation, sometimes increasing the count of `1`s.  
2. For each bit position `i` (from 0 to 62), we check if setting that bit in some element is possible within the budget `k`.  
3. If an element already has the bit set, it contributes directly to the beauty.  
4. If not, we calculate the cost required to set that bit (using increments) and greedily use `k` to maximize beauty.  
5. A **priority queue (min-heap)** is used to efficiently choose the cheapest bit-setting operations.

### Strategy:
- Iterate over all bit positions (up to 63, since numbers can go up to 10¹⁸).  
- For each bit, count contributions from already set bits.  
- For unset bits, push the cost into a min-heap.  
- While `k` allows, pop from the heap and set bits, increasing beauty.  
- Continue until all possible operations are exhausted or `k` runs out.

## Time and Space Complexity
- **Time Complexity:**  
  - `O(63 × n + log n)` per test case due to iterating over bits and using a priority queue.    
- **Space Complexity:**  
  - `O(n)` for storing the array and priority queue.  