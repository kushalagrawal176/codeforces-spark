# Problem Number - 791A Bear and Big Brother  

**Problem Link:** [https://codeforces.com/problemset/problem/791/A](https://codeforces.com/problemset/problem/791/A)  

---

## Topics
- Implementation  
- Simulation  
- Math  

---

## Constraints
- 1 ≤ `a` ≤ `b` ≤ 10  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem describes two bears: Limak with weight `a` and Bob with weight `b`.  
- Each year:
  - Limak’s weight triples (`a = a * 3`)  
  - Bob’s weight doubles (`b = b * 2`)  
- We need to find the minimum number of years until Limak’s weight becomes **strictly greater** than Bob’s.  

### Approach:
- Start with a counter `cnt = 0`.  
- While Limak’s weight is less than or equal to Bob’s:
  - Multiply `Limak’s` weight by 3.  
  - Multiply `Bob’s` weight by 2.  
  - Increment the counter.  
- Once Limak’s weight exceeds Bob’s, stop and output the counter.  

This is a straightforward simulation problem where we directly follow the yearly growth rules until the condition is met.  

---

## Time and Space Complexity
- **Time Complexity:** O(k), where `k` is the number of years until Limak surpasses Bob. Since weights grow exponentially, `k` is small (bounded by constraints).  
- **Space Complexity:** O(1), only constant space is used for variables.  
