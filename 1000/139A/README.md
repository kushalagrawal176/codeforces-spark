# Problem Number - 139A Petr and Book
**Problem Link:** [https://codeforces.com/problemset/problem/139/A](https://codeforces.com/problemset/problem/139/A)

---

## Topics

1. Implementation  
2. Simulation

## Constraints

1. Number of pages in the book 1 ≤ n ≤ 1000
2. Number of pages Peter can read each day 0 ≤ n ≤ 1000

## Intuition / Approach

1. Peter has to read `n` pages and is given an array of 7 integers representing how many pages he can read on each day of the week.  
2. Calculate the sum of pages he reads in one full week.  
3. Since the reading pattern repeats every week, reduce the total pages `n` modulo the weekly sum to get the pages needed to read in a partial week.  
4. If `n % sum == 0`, that means he finishes exactly at the end of a week, so set pages to the full week's sum.  
5. Iterate through each day, subtracting pages read that day from `pages` until the remaining pages are less than or equal to pages read on that day.  
6. The day on which pages get completed is the answer.

---

## Time and Space Complexity

- **Time Complexity:** O(1) (constant time - fixed size array (7) for days of the week)  
- **Space Complexity:** O(1)
