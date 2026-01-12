# Problem Number - 1339B Sorted Adjacent Differences  
**Problem Link:** [https://codeforces.com/problemset/problem/1339/B](https://codeforces.com/problemset/problem/1339/B)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 3 ≤ `n` ≤ 10⁵ (array size)  
- -10⁹ ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to rearrange the array so that the **absolute differences between adjacent elements are sorted in non-decreasing order**.  
- First, sort the array.  
- Then, start from the **middle element** and alternately pick elements to the left and right.  
- This construction ensures that the differences between consecutive elements are balanced and naturally sorted.  

### Example  
- Input array: [4, 1, 5, 2, 3]  
- Sorted array: [1, 2, 3, 4, 5]  
- Rearranged: [3, 4, 2, 5, 1]  
- Differences: [1, 2, 3, 4] → sorted.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)`, due to sorting.  
- **Space Complexity:** `O(n)`, for storing the rearranged sequence.  
