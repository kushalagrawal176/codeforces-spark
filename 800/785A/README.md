# Problem Number - 785A Anton and Polyhedrons  
**Problem Link:** [https://codeforces.com/problemset/problem/785/A](https://codeforces.com/problemset/problem/785/A)  

---

## Topics
- Implementation
- Simulation
- Math

## Constraints
- 1 ≤ `n` ≤ 200000
- Each polyhedron name is one of: "Tetrahedron", "Cube", "Octahedron", "Dodecahedron", "Icosahedron"  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the total number of faces of `n` polyhedrons given their names.  
- Each polyhedron has a fixed number of faces:  
  - Tetrahedron → 4  
  - Cube → 6  
  - Octahedron → 8  
  - Dodecahedron → 12  
  - Icosahedron → 20  
- Approach:
  1. Read the integer `n`.  
  2. For each of the `n` polyhedrons, read its name.  
  3. Add the corresponding number of faces to a running sum.  
  4. Output the final sum.  
- This is a straightforward mapping problem with direct accumulation.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we process each polyhedron once.  
- **Space Complexity:** `O(1)`, only a counter variable is used.
