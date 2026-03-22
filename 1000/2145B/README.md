# Problem Number - 2145B Deck of Cards

**Problem Link:** [https://codeforces.com/problemset/problem/2145/B](https://codeforces.com/problemset/problem/2145/B)

---

## Topics
- Greedy
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `k` ≤ `n` ≤ 2 × 10⁵
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given a deck of cards numbered from **1 to n**, initially ordered from top (1) to bottom (n).
- Monocarp performs **k actions**, each described by a string `s` of length `k`:
  - `'0'` → remove the top card
  - `'1'` → remove the bottom card
  - `'2'` → remove either the top or bottom card
- The task is to determine the **fate of each card**:
  - `'+'` → card is definitely still in the deck
  - `'-'` → card is definitely removed
  - `'?'` → card’s fate is uncertain (could be removed or remain)

### Step-by-step reasoning:
1. Maintain two pointers:
   - `l` → number of guaranteed top removals (`'0'`)
   - `r` → number of guaranteed bottom removals (`'1'`)
   - `either` → number of flexible removals (`'2'`)
2. After processing the string `s`:
   - Cards strictly before `l` or strictly after `r` are **removed** (`'-'`).
   - Cards within `[l, r]` but possibly affected by `either` removals are **uncertain** (`'?'`).
   - Remaining cards are **safe** (`'+'`).
3. Special case: if `k == n`, then all cards are removed (`'-'`).

This greedy approach works because each removal action only affects the boundaries of the deck, and uncertainty arises only when `'2'` actions exist.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the string and then through the deck.
- **Space Complexity:** `O(n)`, for storing the result array of card states.
