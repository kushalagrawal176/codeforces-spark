# Problem Number - 200B Drinks  
**Problem Link:** [https://codeforces.com/problemset/problem/200/B](https://codeforces.com/problemset/problem/200/B)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

## Constraints  
- 1 ≤ `n` ≤ 100 (number of drinks)  
- 0 ≤ `pᵢ` ≤ 100 (percentage of orange juice in each drink)  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to calculate the average percentage of orange juice in a mixture of `n` drinks.  
- Each drink has a percentage `pᵢ` of orange juice.  
- When mixing all drinks together, the resulting percentage is simply the arithmetic mean of all given percentages.  

### Approach:  
- Read the number of drinks `n`.  
- Read the percentages `pᵢ` for each drink.  
- Compute the sum of all percentages.  
- Divide the sum by `n` to get the average percentage.  
- Output the result as a floating-point number.  

This is a straightforward averaging problem.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we iterate through all drinks once.  
- **Space Complexity:** `O(1)`, only a variable to store the sum is needed.  
