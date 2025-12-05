# Problem Number - 2126A  Only One Digit

**Problem Link:** [https://codeforces.com/problemset/problem/2126/A](https://codeforces.com/problemset/problem/2126/A)  

---

## Topics
- Implementation  
- Math  
- Number Theory  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `x` ≤ 1000 (input number)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find the smallest non-negative integer `y` such that the numbers `x` and `y` share at least one common digit.  
- For each test case:  
  - Read the integer `x`.  
  - Extract digits one by one using modulo (`x % 10`) and division (`x / 10`).  
  - Track the minimum digit encountered.  
  - Once all digits are processed, output the smallest digit.  

- This approach works because checking each digit ensures we correctly identify the minimum, regardless of the number’s length.  

## Time and Space Complexity
- **Time Complexity:** `O(d)`, where `d` is the number of digits in `x`. Since `x ≤ 1000`, `d ≤ 4`. Effectively `O(1)`.  
- **Space Complexity:** `O(1)`, only a few variables are used to track the minimum digit.  
