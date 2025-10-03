How's my day went on today ?
     One of the worst day WFH, Fck off need to focus on my path . i'm better !!


Problem 1) Find the largest number in an array      
problem 2) Find the second largest in an array

# Day 4 – Find the Second Largest Element in an Array

## 🚀 Overview
On Day 4 of my 100 Days of DSA Grind, I implemented a program to **find the second largest number in an array**.  
I wrote solutions in both **Java** and **Go** to strengthen my problem-solving in multiple languages.

---

## 🛑 Common Mistakes I Faced
### In Java
- ❌ Used `elseif` instead of `else if` (syntax error).
- ❌ Initialized `largest` and `secondLargest` with `arr[0]` → caused wrong results for negative arrays or when the first element was max.
- ❌ Didn’t handle edge cases like arrays with duplicate max values.

### In Go
- ❌ Same initialization issue → `anyArr[0]` failed for negatives.
- ❌ Duplicates not handled properly.
- ❌ Edge cases (all equal numbers, single element) returned `math.MinInt`.

---

## ✅ Fixes and Lessons Learned
- Initialize with `Integer.MIN_VALUE` (Java) / `math.MinInt` (Go) instead of `arr[0]`.
- Use condition `arr[i] > secondLargest && arr[i] < largest` to ensure **second distinct largest**.
- Always handle edge cases: arrays with size < 2, or all equal numbers.

---

## 📌 Example
Array:
```text
[1000, 67548, 5, -85849, 73829, 65, 0, -3, 674]
