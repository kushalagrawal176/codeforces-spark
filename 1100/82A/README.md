# Problem Number - 82A Double Cola  
**Problem Link:** [https://codeforces.com/problemset/problem/82/A](https://codeforces.com/problemset/problem/82/A)  

---

## Topics  
- Implementation  
- Simulation  
- Math  

## Constraints  
- 1 ≤ n ≤ 10^9  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The queue starts with five friends: **Sheldon, Leonard, Penny, Rajesh, Howard**.  
- Each time, the person at the front drinks a cola and then goes to the end of the queue **twice**, which doubles their future appearances.  
- The sequence grows exponentially:  
  - Round 1: 5 people (each appears once).  
  - Round 2: 10 people (each appears twice).  
  - Round 3: 20 people (each appears four times).  
  - And so on.  
- To solve:  
  1. Determine the round in which the `n`-th cola is consumed.  
     - Subtract the size of each round until `n` fits.  
  2. Once the round is found, divide the remaining `n` by the repetition factor to identify the person.  
- This avoids simulating the entire queue up to `n` (which could be as large as 10^9).  

## Time and Space Complexity  
- **Time Complexity:** O(log n), since each round doubles and we only need to iterate until `n` fits.  
- **Space Complexity:** O(1), only constant space used for names and counters.  
