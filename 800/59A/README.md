# Problem Number - 59A Word  

**Problem Link:** [https://codeforces.com/problemset/problem/59/A](https://codeforces.com/problemset/problem/59/A)  

---

## Topics
- Implementation  
- Strings  
- Greedy  

---

## Constraints
- 1 ≤ `|s|` ≤ 100  
- String consists only of uppercase and lowercase Latin letters  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- We are given a word consisting of uppercase and lowercase letters.  
- The task is to convert the word entirely to either lowercase or uppercase depending on the counts:  
  - If the number of lowercase letters is **greater than or equal to** the number of uppercase letters, convert the whole word to lowercase.  
  - Otherwise, convert the whole word to uppercase.  
- To solve this:  
  - Count the number of uppercase letters in the string.  
  - Compare it with the number of lowercase letters (`length - uppercaseCount`).  
  - Apply the transformation accordingly using built-in string functions.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)`, where `n` is the length of the string (we scan once to count uppercase letters).  
- **Space Complexity:** `O(1)`, only a counter variable is used aside from the input string.  
