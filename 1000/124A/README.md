# Problem Number - 124A The number of positions  
**Problem Link:** [https://codeforces.com/problemset/problem/124/A](https://codeforces.com/problemset/problem/124/A)  

---

## Topics
- Math  
- Implementation  

## Constraints 
- 0 ≤ `a`, `b` < `n` ≤ 100
- Time limit per test: 0.5 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the number of valid positions a person can take in a queue of `n` people.  
- Conditions:  
  - At least `a` people must be in front of the person.  
  - At most `b` people can be behind the person.  
- The number of valid positions is determined by the overlap of these constraints.  
- Formula:  
  - The answer is `min(n - a, b + 1)`.  
  - `n - a` ensures there are at least `a` people in front.  
  - `b + 1` ensures there are at most `b` people behind.  
- Taking the minimum of these two values gives the number of valid positions.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only a direct formula is used.  
- **Space Complexity:** `O(1)`, no extra space required.  
