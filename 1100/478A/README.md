# Problem Number - 478A Initial Bet  
**Problem Link:** [https://codeforces.com/problemset/problem/478/A](https://codeforces.com/problemset/problem/478/A)  

---

## Topics
- Implementation  
- Math  

## Constraints
- Input: 5 integers (each bet amount)  
- Each integer is between `0` and `100`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem provides 5 integers representing the money each friend contributes.  
- They want to divide the total sum equally among themselves.  
- For this to be possible:  
  - The total sum must be divisible by 5.  
  - The sum must be greater than 0 (to avoid the case where all bets are zero).  
- If both conditions are satisfied, the answer is `sum / 5`.  
- Otherwise, the answer is `-1`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only 5 numbers are read and summed.  
- **Space Complexity:** `O(1)`, only constant space used for storing the inputs and sum.  
