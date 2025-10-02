write a function that returns the number of negative numbers in an array
Solution at File1.java

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
