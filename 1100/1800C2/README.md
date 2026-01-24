# Problem Number - 1800C2 Powering the Hero (hard version)  

**Problem Link:** [https://codeforces.com/problemset/problem/1800/C2](https://codeforces.com/problemset/problem/1800/C2)  

---

## Topics  
- Priority Queue  
- Greedy  
- Data Structures  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array size per test case)  
- 0 ≤ `a[i]` ≤ 10⁹ (array elements, where 0 represents a "hero power activation")  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem simulates a sequence of events where positive integers represent "power values" and zeros represent "activation moments."  
- At each activation (when `a[i] = 0`), the hero can use the **largest available power** collected so far.  
- To efficiently retrieve the maximum power at each activation, we use a **max-heap (priority queue)**:  
  1. Traverse the array.  
  2. If the element is positive, push it into the priority queue.  
  3. If the element is zero and the queue is not empty, pop the largest element and add it to the total sum.  
- This greedy approach ensures that the hero always uses the strongest available power at each activation, maximizing the total sum.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)` per test case (due to priority queue operations).  
- **Space Complexity:** `O(n)` for storing elements in the priority queue.  
