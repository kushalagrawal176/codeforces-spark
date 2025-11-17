# Problem Number - 282A Bit++  
**Problem Link:** [https://codeforces.com/problemset/problem/282/A](https://codeforces.com/problemset/problem/282/A)  

---

## Topics  
- Implementation  
- Simulation  
- Strings  

## Constraints  
- 1 ≤ n ≤ 150  
- Each operation string length = 3  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem defines a variable `x` initially equal to 0.  
- There are `n` operations, each being one of the following: `"++X"`, `"X++"`, `"--X"`, `"X--"`.  
- Each operation either increments or decrements the variable `x`.  
- The key observation is that the middle character of the string (`s[1]`) determines the operation:  
  - If it is `'+'`, increment `x`.  
  - If it is `'-'`, decrement `x`.  
- After processing all operations, output the final value of `x`.  

## Time and Space Complexity  
- **Time Complexity:** O(n), since we process each operation once.  
- **Space Complexity:** O(1), only a single integer variable is maintained.  
