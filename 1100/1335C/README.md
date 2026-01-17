# Problem Number - 1335C Two Teams Composing  
**Problem Link:** [https://codeforces.com/problemset/problem/1335/C](https://codeforces.com/problemset/problem/1335/C)  
---
## Topics
- Greedy  
- Frequency Counting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ `n`  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are asked to divide players into two teams such that:
  - Each team has distinct skill values.  
  - The number of players in each team is maximized.  
- Key observations:
  - Let `maxFreq` = the maximum frequency of any skill.  
  - Let `uniqueSkills` = the number of distinct skills.  
  - The answer depends on balancing these two values.  
- The formula for the maximum team size is: 
 $\text{ans} = \max(\min(\text{maxFreq}, \text{uniqueSkills} - 1), \min(\text{uniqueSkills}, \text{maxFreq} - 1))$  
- This ensures we account for both constraints:  
  - You cannot exceed the number of unique skills.  
  - You cannot exceed the maximum frequency of a single skill.  
- Iterate through all test cases, compute frequencies, and apply the formula.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we count frequencies and compute max.  
- **Space Complexity:** `O(n)`, for storing frequency map.  
