# Notes

Consolidated learning notes from the original Day-1 / DayTwo / Day_3 ... Day_7
folders, organized by the topic each day's work now lives under.

## Basics

### DayTwo — 02-10-2025
Source: `DayTwo/DayTwo.md`

After being lazy for sometime finnaly i am getting started at 13.01 --> 02-10-2025

doing the manual copiling and running the code

### Day 1 — 01-10-2025
Source: `Day-1/Day-1.md`

Checking my experience with day 1 of git
and i trying to commit this

Craeting a simple git repo made me to feel overwhelmed !!!

time 00.48 01-10-2025

## Arrays

### Day 3
Source: `Day_3/Day_3-Readme.md`

write a function that returns the number of negative numbers in an array
Solution at File1.java (now `Arrays/Filter_Negative_Numbers.java`)

=========================================================================

# 📘 Day 3 – Java Learning Log

## ✅ What I Practiced
- **Returning Arrays from Methods**
  - Wrote methods with return type `int[]`.
  - Learned that arrays in Java are **objects**, so methods can return them like normal variables.

- **Filtering Negatives from an Array**
  - Created a method `GetNegative(int[] anyArray)` that returns all negative numbers.
  - Explored two approaches:
    1. Using **ArrayList<Integer>** to dynamically collect elements and then converting to `int[]`.
    2. Pure array-based approach (manual count + copy, more DSA-style).

- **Common Errors I Faced & Fixed**
  - ❌ Returning an `ArrayList<Integer>` when method expected `int[]`.
  - ❌ Writing `result = negative.get(i);` instead of `result[i] = negative.get(i);`.
  - ❌ Returning inside the loop → caused early exit.
  - ✅ Fixed by:
    - Declaring correct return type.
    - Converting ArrayList → array with a loop.
    - Returning after loop finishes.

---

## 📝 Key Takeaways
- Arrays in Java are **fixed size**, so `ArrayList` is needed for dynamic storage.
- To convert `ArrayList<Integer>` → `int[]`:
  ```java
  int[] result = new int[list.size()];
  for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
  }
  ```

### Day 4
Source: `Day_4/Day_4.md`

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
- ❌ Didn't handle edge cases like arrays with duplicate max values.

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
```

*(Note: the original notes referenced a Go solution for this problem — Go has since been removed from this repo, which is Java-only going forward.)*

## Pattern Printing

### Day 5 — completed 03:12am, 05-10-2025
Source: `Day_5/Day_5_ReadMe.md`

# 🧠 Learning Java Through Patterns & Logic

This repository documents my **Java learning journey**, focused on loops, logic building, and pattern printing — from the ground up.
Every file here represents a new step in my understanding of **Java fundamentals, scope, and memory**.

---

## 🚀 Overview

I started this repo as a complete beginner — writing small programs, dry-running them manually, and understanding how Java loops work internally.
Each file builds on the previous one, helping me (and future learners) *see the logic evolve line by line*.

---

## 🧩 What I've Covered So Far

### 1️⃣ Understanding Loops and Iterations
- Learned how `for` loops control repetition.
- Understood the difference between **outer** and **inner** loops:
  - Outer loop → controls **rows** (number of lines)
  - Inner loop → controls **columns** (number of elements inside each row)
- Practiced nested loops and visualized how they build shapes line by line.

---

### 2️⃣ String Concatenation Inside Loops
- Declared `String row = "";` inside the loop → resets each iteration.
- Learned that when declared inside the loop, `row` exists only for that row (memory fades after each iteration).
- Understood how `row = row + "*";` builds each row progressively.

---

### 3️⃣ Basic Pattern Building
Built multiple patterns like:
- **Left-aligned triangles**
- **Right-aligned triangles**
- **Full pyramids**

#### Example:
```java
for (int i = 0; i < n; i++) {
    String row = "";
    for (int j = 0; j < n - (i + 1); j++) row += " ";
    for (int k = 0; k <= i; k++) row += "*";
    System.out.println(row);
}
```
Output:
```
    *
   **
  ***
 ****
*****
```

### 4️⃣ Dynamic Loop Logic (n - (i + 1) vs n - i)
Understood why we use expressions like `n - (i + 1)` or `n - i`:
- `n - (i + 1)` → when i starts at 0
- `n - i` → when i starts at 1

Realized that pattern logic is purely mathematical — a relationship between total rows and current row number.

### 5️⃣ Scope & Memory Management
- Variables declared inside a loop are recreated each iteration.
- Variables declared outside a loop persist across iterations.
- Practiced both cases to understand variable lifetime.

### 6️⃣ The Toggle Concept 🔁
A major turning point in my understanding — learned from Akshay Saini's explanation.

```java
int toggle = 1;
for (int i = 0; i < n; i++) {
    String row = "";
    for (int j = 0; j <= i; j++) {
        row = row + toggle;
        toggle = (toggle == 1) ? 0 : 1; // Flip the value
    }
    System.out.println(row);
}
```
Output:
```
1
01
010
1010
01010
```

Key Learnings:
- Toggle is used to flip values (1 ↔ 0) dynamically.
- When declared outside the outer loop → retains state across rows.
- When declared inside the outer loop → resets every new row.
- Helped me understand scope, state, and logical flow together.

## 🧠 Realizations So Far
- Loops are not just repetition tools — they build structure.
- Variable scope decides when memory fades and when state persists.
- space and star loops combine logically to build visual patterns.
- Understanding the "why" behind each formula is more valuable than memorizing syntax.

## Math

### Day 6
Source: `Day_6/Day_6_ReadMe.md`

Write a Function taht returns the count of digits in a number

write a function to find whether the bumber is palindrome or not

🧠 Day 6 — Palindrome Numbers & Integer Overflow Handling

📅 Date: Day 6 of the 100-day Java DSA Challenge

🚀 Topics Covered
- Palindrome Number Logic (Mathematical approach)
- Reversing an Integer using loops
- Understanding integer overflow in Java
- How Java handles overflow silently (two's complement)
- Safe reversal using long and boundary checks
- Learning about Integer.MAX_VALUE and Integer.MIN_VALUE
- Why checks must happen before overflow occurs
- Using ternary operator with type casting properly

💻 Practice Files
- `File16.java` (now `Math/Palindrome_Number_Check.java`) — Checks if a number is a palindrome using pure integer math.
- `ReverseInteger.java` — Solves LeetCode #7 "Reverse Integer" — handles overflow using long. *(referenced in the original notes but not present as a file in this repo.)*

📘 Key Learnings

🔹 1. Palindrome Logic (Without Strings)
```java
int original = num;
int reversed = 0;
while (num > 0) {
    int digit = num % 10;
    reversed = reversed * 10 + digit;
    num /= 10;
}
System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");
```

🔹 2. Why Overflow Happens

Java's int range → −2,147,483,648 to 2,147,483,647.
If `rev * 10 + last` exceeds this, the value silently wraps around — no error, no warning → wrong results.

🔹 3. Final Optimized Reverse Integer Solution
```java
class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int) rev;
    }
}
```

✅ Beats ~82% of Java solutions on LeetCode.
✅ Mathematically safe, no extra branches inside loop.

🧩 Concepts Strengthened
- Two's complement arithmetic in Java
- Silent overflow vs compile-time errors
- Use of long for temporary safety
- Ternary operator precedence and type casting
- Thinking mathematically about limits instead of relying on exceptions

## SearchAndSorting

### Day 7 — Midnight Grinding
Source: `Day_7/Time_Complexity_Space_Complexity.md`

🧠 Day 7 – Time & Space Complexity (Midnight Grinding)

🕒 What is Time Complexity?

Time Complexity measures how efficiently an algorithm performs as the input size increases.
It does not refer to the actual execution time of a program.

⚖️ Time Complexity ≠ Execution Time

🔍 Linear Search vs Binary Search

Linear Search
- Best Case: Element found at 1st index → 1 operation
- Average Case: Element at middle → n/2 operations
- Worst Case: Element not found → n operations
- Time Complexity: O(n)
- Requirement: Works on unsorted arrays

Binary Search
- Best Case: Middle element matches → 1 operation
- Average/Worst Case: log₂(n) operations
- Time Complexity: O(log n)
- Requirement: Works on sorted arrays

🧩 Example: For an input size of 100,
- Linear Search → 100 steps
- Binary Search → only ~7 steps

As input grows, Binary Search scales far better.

💡 Big O Notation

Big O represents the worst-case scenario — how the runtime grows as input size increases.

| Complexity | Name | Example |
|---|---|---|
| O(1) | Constant | Accessing an element |
| O(log n) | Logarithmic | Binary Search |
| O(n) | Linear | Linear Search |
| O(n log n) | Linearithmic | Merge Sort |
| O(n²) | Quadratic | Nested loops |
| O(n³) | Cubic | Triple nested loops |
| O(2ⁿ) | Exponential | Recursive Fibonacci |
| O(n!) | Factorial | Permutations |

⚙️ Common Time Complexity Code Examples

🟩 O(1) – Constant Time
```java
int value = arr[5];  // Direct access
```

🟨 O(n) – Linear Time
```java
for (int i = 0; i < n; i++) {
    // do something
}
```

🟦 O(log n) – Logarithmic Time
```java
int binarySearch(int arr[], int n, int key) {
    int low = 0, high = n - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == key) return mid;
        else if (arr[mid] < key) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
```

🟧 O(n²) – Quadratic Time
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // do something
    }
}
```

🟪 O(n log n) – Linearithmic Time
```java
for (int i = 0; i < n; i++) {
    int temp = n;
    while (temp > 1) {
        temp = temp / 2;
        // do something
    }
}
```

🟥 O(n³) – Cubic Time
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            // do something
        }
    }
}
```

🌀 O(2ⁿ) – Exponential Time
```java
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```

⚠️ O(n!) – Factorial Time
```cpp
void permute(string s, int l, int r) {
    if (l == r) cout << s << endl;
    else {
        for (int i = l; i <= r; i++) {
            swap(s[l], s[i]);
            permute(s, l + 1, r);
            swap(s[l], s[i]); // backtrack
        }
    }
}
```

🧮 Time Complexity Priority (Best to Worst)

| Rank | Complexity | Example |
|---|---|---|
| 🥇 | O(1) | Constant Time |
| 🥈 | O(log n) | Binary Search |
| 🥉 | O(n) | Linear Search |
| 4️⃣ | O(n log n) | Merge Sort |
| 5️⃣ | O(n²) | Nested Loops |
| 6️⃣ | O(n³) | Triple Loops |
| 7️⃣ | O(2ⁿ) | Fibonacci Recursion |
| 8️⃣ | O(n!) | Permutations |

💾 What is Space Complexity?

Space Complexity measures how much extra memory an algorithm uses.

| Example | Space Complexity |
|---|---|
| Access 5th element | O(1) |
| Find max with variable | O(1) |
| Create new array | O(n) |
| 2D matrix | O(n²) |

📘 Summary
- Time Complexity → measures speed growth
- Space Complexity → measures memory usage
- Goal: Write algorithms with low time & space complexity
