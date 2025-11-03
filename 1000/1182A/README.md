# Problem Number - 1182A Filling Shapes
**Problem Link:** [https://codeforces.com/problemset/problem/1182/A](https://codeforces.com/problemset/problem/1182/A)

---

## Topics

1. Bit Manipulation  
2. Mathematics  
3. Implementation

---

## Constraints

1. n is an integer where 1 ≤ n ≤ 60 
2. Each tile used is a 3×n.

---

## Intuition / Approach

1. The problem asks for the number of ways to completely fill a 3×n rectangle using a particular tile shape without overlaps or gaps.
2. You can only fill the rectangle when n is even. If n is odd, the answer is 0, because the tile shape cannot cover the grid completely for odd n.  
3. When n is even, 
    - Each time you add 2 columns (making the grid 3×2), you can fill it in 2 ways  
    - For n columns, you have n/2 pairs, so total number of ways is 2^(n/2).

---

## Time and Space Complexity

- Time Complexity: O(1)  
- Space Complexity: O(1)
