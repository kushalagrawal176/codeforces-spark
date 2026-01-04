# Problem Number - 2103A Common Multiple  

**Problem Link:** [https://codeforces.com/problemset/problem/2103/A](https://codeforces.com/problemset/problem/2103/A)  

---

## Topics
- Implementation  
- Hashing / Sets  
- Counting Distinct Elements  

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 1 ≤ `n` ≤ 100 (number of integers per test case)  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine how many distinct integers are present in each test case.  
- In the C++ solution, an `unordered_map` was used to count occurrences, and then the number of unique keys was printed.  
- In Java, this can be simplified by using a `HashSet<Integer>` which automatically stores only unique values.  
- The size of the set directly gives the number of distinct integers.  

### Steps:
1. Read the number of test cases `t`.  
2. For each test case, read `n` (the number of integers).  
3. Insert each integer into a `HashSet`.  
4. After processing all numbers, output the size of the set.  

This works because sets inherently eliminate duplicates, so the final size equals the count of unique numbers.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each insertion into the set is O(1) on average.  
- **Space Complexity:** `O(n)`, for storing the unique integers in the set.  