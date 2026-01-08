# Problem Number - 1345B Card Constructions  
**Problem Link:** [https://codeforces.com/problemset/problem/1345/B](https://codeforces.com/problemset/problem/1345/B)  

---

## Topics
- Binary Search  
- Greedy  
- Math  
- DP

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks how many pyramid-like card structures can be built using `n` cards.  
- A pyramid of height `h` requires `(3h² + h)/2` cards.  
- The strategy is to repeatedly build the largest possible pyramid that fits within the remaining cards.  
- To find the largest pyramid height for a given `n`, binary search is used over possible heights.  
- After building one pyramid, subtract its card count from `n` and repeat until fewer than 2 cards remain.  
- The number of pyramids built is the answer.  

## Time and Space Complexity
- **Time Complexity:** `O(log n)` per pyramid construction due to binary search. In worst case, multiple pyramids are built, but the total operations remain efficient within constraints.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
