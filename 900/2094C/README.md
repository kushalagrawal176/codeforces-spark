# Problem Number - 2094C Brr Brrr Patapim  
**Problem Link:** [https://codeforces.com/problemset/problem/2094/C](https://codeforces.com/problemset/problem/2094/C)  

---

## Topics
- Implementation  
- Hashing / Frequency Counting  
- Strings  

## Constraints
- 1 ≤ `t` ≤ 200  
- 1 ≤ `n` ≤ 800  
- Matrix size: n × n  
- Elements are integers in the range `[1, 2n]`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem provides an **n × n matrix** filled with integers between 1 and 2n.  
- We need to output a sequence of distinct numbers that appear in the matrix, **prefixed by the missing number** from the range [1, 2n].  
- Steps:  
  1. Read the matrix and count the frequency of each number using a hash map.  
  2. While reading, if a number appears for the first time, append it to the result string.  
  3. After processing the matrix, check the range [1, 2n] to find the missing number (the one not present in the matrix).  
  4. Prepend this missing number to the result string.  
  5. Print the final sequence.  

## Time and Space Complexity
- **Time Complexity:** `O(n²)`, for reading the matrix and counting frequencies.  
- **Space Complexity:** `O(n)`, for storing frequencies in a hash map.  