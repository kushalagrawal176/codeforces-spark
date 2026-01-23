# Problem Number - 478B Random Teams  
**Problem Link:** [https://codeforces.com/problemset/problem/478/B](https://codeforces.com/problemset/problem/478/B)  

---

## Topics
- Combinatorics  
- Math  
- Implementation  

## Constraints
- 1 ≤ `m` ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to calculate the **minimum** and **maximum** number of pairs of friends that can be formed when `n` people are divided into `m` teams.  
- **Maximum pairs:**  
  - To maximize pairs, put as many people as possible into one team and the rest into separate teams.  
  - Largest team size = `n - m + 1`.  
  - Number of pairs = `(num × (num - 1)) / 2`, where `num = n - m + 1`.  
- **Minimum pairs:**  
  - To minimize pairs, distribute people as evenly as possible among all teams.  
  - Each team will have either `⌊n/m⌋` or `⌊n/m⌋ + 1` members.  
  - Let `d = n / m` (integer division) and `r = n % m`.  
  - Teams with size `d` contribute `(d × (d - 1)) / 2` pairs.  
  - Teams with size `d + 1` contribute `((d + 1) × d) / 2` pairs.  
  - Total minimum pairs = `((d × (d - 1)) / 2) × (m - r) + (((d + 1) × d) / 2) × r`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since calculations are direct formulas.  
- **Space Complexity:** `O(1)`, only constant extra space used.  
