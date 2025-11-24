# Problem Number - 427A Police Recruits

**Problem Link:** [https://codeforces.com/problemset/problem/427/A](https://codeforces.com/problemset/problem/427/A)

---

## Topics
- Implementation
- Simulation
- Greedy

## Constraints
- 1 ≤ `n` ≤ 10^5 (number of events)
- Each event is either -1 (crime occurs) or a positive integer (number of police recruits hired)
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem describes a sequence of events in a city:
  - If the event is a positive integer, that many police officers are recruited.
  - If the event is -1, a crime occurs.
- Crimes can only be handled if there is at least one available police officer.
- If a crime occurs and no police officers are available, the crime goes untreated.
- Approach:
  1. Maintain a counter for available police officers.
  2. Iterate through the events:
     - If the event is positive, add to the police counter.
     - If the event is -1:
       - If police > 0, decrease police (crime handled).
       - Otherwise, increment untreated crimes counter.
  3. At the end, output the number of untreated crimes.
- Example:  
  - Input: `5` events → `-1 -1 1 -1 -1`  
  - Step-by-step:  
    - Crime (no police) → untreated = 1  
    - Crime (no police) → untreated = 2  
    - Recruit 1 police → police = 1  
    - Crime (police available) → police = 0  
    - Crime (no police) → untreated = 3  
  - Output: `3`

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we process each event once.  
- **Space Complexity:** `O(1)`, only counters are used.
