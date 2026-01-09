# Problem Number - 709A Juicer  
**Problem Link:** [https://codeforces.com/problemset/problem/709/A](https://codeforces.com/problemset/problem/709/A)  

---

## Topics  
- Implementation  
- Simulation  
- Greedy  

## Constraints  
- 1 ≤ `n` ≤ 10⁵ (number of oranges)  
- 1 ≤ `b` ≤ `d` ≤ 10⁶ (maximum size of orange that can fit into the juicer)  
- `d` - (capacity threshold before cleaning is required)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given a sequence of orange sizes. The juicer can only process oranges of size **≤ b**.  
- Each valid orange adds its size to the juicer’s waste container.  
- If at any point the accumulated waste exceeds **d**, the juicer must be cleaned, which resets the waste to zero and increments the cleaning counter.  
- The problem is essentially a simulation:  
  1. Iterate through all oranges.  
  2. If the orange size `x` is ≤ `b`, add it to the current waste sum.  
  3. If the waste sum exceeds `d`, reset it to 0 and increment the cleaning counter.  
- At the end, the counter represents the number of times the juicer was cleaned.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we process each orange exactly once.  
- **Space Complexity:** `O(1)`, only a few variables are used for tracking the waste and cleaning count.  
