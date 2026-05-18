# Problem Number - 2133B Villagers

**Problem Link:** [https://codeforces.com/problemset/problem/2133/B](https://codeforces.com/problemset/problem/2133/B)

---

## Topics
- Greedy
- Sorting

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2·10⁵ (number of villagers per test case)  
- 1 ≤ `aᵢ` ≤ 10⁹ (strength of each villager)  
- Sum of `n` across all test cases ≤ 2·10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem requires finding the minimum total strength of villagers chosen to form pairs.  
- After sorting the villagers by strength, the optimal strategy is to pair them in order.  
- If `n` is odd, we start summing from index `0`. If `n` is even, we skip the first element and start from index `1`.  
- This ensures that the weakest villager is always paired optimally, minimizing the total sum.  
- The sum is taken over every second element starting from the chosen index.  

**Step-by-step reasoning:**
1. Sort the array of villagers’ strengths.  
2. If `n` is odd → start summing from index `0`.  
3. If `n` is even → start summing from index `1`.  
4. Add every second element to the answer.  
5. Print the result for each test case.  

---

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting takes `O(n log n)`.  
  - Summation takes `O(n)`.  
  - Overall: `O(n log n)` per test case.  

- **Space Complexity:**  
  - `O(n)` for storing villagers’ strengths.  