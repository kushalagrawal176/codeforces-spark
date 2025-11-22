# Problem Number - 228A Is your horseshoe on the other hoof?  
**Problem Link:** [https://codeforces.com/problemset/problem/228/A](https://codeforces.com/problemset/problem/228/A)  

---

## Topics  
- Implementation  
- Sets / HashMap
- Simple Math  

## Constraints  
- Input: 4 integers (each representing a horseshoe color)  
- 1 ≤ `color` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Valera wants all four horseshoes to have different colors.  
- The problem reduces to finding how many duplicates exist among the four given integers.  
- Using a `set` (or similar data structure), we can count the number of distinct colors.  
- Since there are always 4 horseshoes, the number of horseshoes Masha needs to buy is:  
  

Answer = `4` - `number of distinct colors`


  
- Example: If the input is `7 7 7 7`, then distinct colors = 1, so she needs to buy `4 - 1 = 3` horseshoes.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since we only process 4 integers.  
- **Space Complexity:** `O(1)`, only a small set is used to store distinct values.  
