Write a Function taht returns the count of digits in a number 

write a function to find whether the bumber is palindrome or not 

🧠 Day 6 — Palindrome Numbers & Integer Overflow Handling
📅 Date

Day 6 of the 100-day Java DSA Challenge

🚀 Topics Covered

Palindrome Number Logic (Mathematical approach)

Reversing an Integer using loops

Understanding integer overflow in Java

How Java handles overflow silently (two’s complement)

Safe reversal using long and boundary checks

Learning about Integer.MAX_VALUE and Integer.MIN_VALUE

Why checks must happen before overflow occurs

Using ternary operator with type casting properly

💻 Practice Files
File Name	Description
File16.java	Checks if a number is a palindrome using pure integer math.
ReverseInteger.java	Solves LeetCode #7 “Reverse Integer” — handles overflow using long.
📘 Key Learnings
🔹 1. Palindrome Logic (Without Strings)
int original = num;
int reversed = 0;
while (num > 0) {
    int digit = num % 10;
    reversed = reversed * 10 + digit;
    num /= 10;
}
System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");

🔹 2. Why Overflow Happens

Java’s int range → −2,147,483,648 to 2,147,483,647
If rev * 10 + last exceeds this, the value silently wraps around —
no error, no warning → wrong results.

🔹 3. Final Optimized Reverse Integer Solution
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


✅ Beats ~82 % of Java solutions on LeetCode.
✅ Mathematically safe, no extra branches inside loop.

🧩 Concepts Strengthened

Two’s complement arithmetic in Java

Silent overflow vs compile-time errors

Use of long for temporary safety

Ternary operator precedence and type casting

Thinking mathematically about limits instead of relying on exceptions