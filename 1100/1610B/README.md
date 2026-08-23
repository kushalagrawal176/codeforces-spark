# Problem Number - 1610B Kalindrome Array

**Problem Link:** [https://codeforces.com/problemset/problem/1610/B](https://codeforces.com/problemset/problem/1610/B)

---

## Topics
- Greedy
- Two Pointers

## Constraints
- $1 ≤ t ≤ 10^4$ (number of test cases)
- $1 ≤ n ≤ 2 * 10^5$ (length of the array)
- Sum of $n$ over all test cases does not exceed $2 * 10^5$
- $1 ≤ a_i ≤ n$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- An array is called a **kalindrome** if it can be transformed into a palindrome by completely removing all occurrences of some single element $x$ from the array.
- To check if the array can become a kalindrome, we can iterate through the array using two pointers ($i$ from the start, $j$ from the end) to find the first mismatch where `arr[i] != arr[j]`.
- If a mismatch occurs at elements `arr[i]` and `arr[j]`, the only possible elements we could choose to remove to fix this mismatch are either `arr[i]` or `arr[j]`. Removing any other element would not resolve this specific mismatch position.
- Therefore, we test two hypotheses:
  1. Check if the array forms a palindrome after removing all occurrences of `arr[i]`.
  2. Check if the array forms a palindrome after removing all occurrences of `arr[j]`.
- If either condition holds true, the array is a kalindrome ("YES"); otherwise, it is not ("NO"). If no mismatches are found initially, the array is already a palindrome.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case. Finding the first mismatch takes $O(n)$ time, and checking each candidate value using two pointers takes linear time.
- **Space Complexity:** $O(n)$ to store the array elements.