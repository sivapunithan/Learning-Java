🧠 Day 7 – Time & Space Complexity (Midnight Grinding)
🕒 What is Time Complexity?

Time Complexity measures how efficiently an algorithm performs as the input size increases.
It does not refer to the actual execution time of a program.

⚖️ Time Complexity ≠ Execution Time

🔍 Linear Search vs Binary Search
Linear Search

Best Case: Element found at 1st index → 1 operation

Average Case: Element at middle → n/2 operations

Worst Case: Element not found → n operations

Time Complexity: O(n)

Requirement: Works on unsorted arrays

Binary Search

Best Case: Middle element matches → 1 operation

Average/Worst Case: log₂(n) operations

Time Complexity: O(log n)

Requirement: Works on sorted arrays

🧩 Example:
For an input size of 100,

Linear Search → 100 steps

Binary Search → only ~7 steps

As input grows, Binary Search scales far better.

💡 Big O Notation

Big O represents the worst-case scenario — how the runtime grows as input size increases.

Complexity	Name	Example
O(1)	Constant	Accessing an element
O(log n)	Logarithmic	Binary Search
O(n)	Linear	Linear Search
O(n log n)	Linearithmic	Merge Sort
O(n²)	Quadratic	Nested loops
O(n³)	Cubic	Triple nested loops
O(2ⁿ)	Exponential	Recursive Fibonacci
O(n!)	Factorial	Permutations
⚙️ Common Time Complexity Code Examples
🟩 O(1) – Constant Time
int value = arr[5];  // Direct access

🟨 O(n) – Linear Time
for (int i = 0; i < n; i++) {
    // do something
}

🟦 O(log n) – Logarithmic Time
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

🟧 O(n²) – Quadratic Time
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // do something
    }
}

🟪 O(n log n) – Linearithmic Time
for (int i = 0; i < n; i++) {
    int temp = n;
    while (temp > 1) {
        temp = temp / 2;
        // do something
    }
}

🟥 O(n³) – Cubic Time
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            // do something
        }
    }
}

🌀 O(2ⁿ) – Exponential Time
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}

⚠️ O(n!) – Factorial Time
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

🧮 Time Complexity Priority (Best to Worst)
Rank	Complexity	Example
🥇	O(1)	Constant Time
🥈	O(log n)	Binary Search
🥉	O(n)	Linear Search
4️⃣	O(n log n)	Merge Sort
5️⃣	O(n²)	Nested Loops
6️⃣	O(n³)	Triple Loops
7️⃣	O(2ⁿ)	Fibonacci Recursion
8️⃣	O(n!)	Permutations
💾 What is Space Complexity?

Space Complexity measures how much extra memory an algorithm uses.

Example	Space Complexity
Access 5th element	O(1)
Find max with variable	O(1)
Create new array	O(n)
2D matrix	O(n²)
📘 Summary

Time Complexity → measures speed growth

Space Complexity → measures memory usage

Goal: Write algorithms with low time & space complexity