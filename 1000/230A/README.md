# Problem Number - 230A Dragons  
**Problem Link:** [https://codeforces.com/problemset/problem/230/A](https://codeforces.com/problemset/problem/230/A)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  

## Constraints  
- 1 ≤ `s` ≤ 10⁴ (initial strength)  
- 1 ≤ `n` ≤ 10³ (number of dragons)  
- `Dragon strength` and `bonus values` are integers between 1 and 10⁴  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to determine if the hero can defeat all dragons given his initial strength.  
- Strategy:  
  1. Each dragon has a strength requirement and a bonus that increases the hero’s strength after defeating it.  
  2. To maximize chances of success, sort dragons by their strength in ascending order.  
  3. Traverse the sorted list:  
     - If the hero’s current strength is greater than the dragon’s strength, defeat it and add the bonus.  
     - If not, the hero fails immediately.  
  4. If all dragons are defeated, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)`, due to sorting the dragons.  
- **Space Complexity:** `O(n)`, for storing dragon strength and bonus values.  
