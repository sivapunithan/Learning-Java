In JavaScript, a Higher-Order Function (HOF) is simply a function that can take another function as an argument, or return a function, or both.

Because in JavaScript, functions are first-class citizens — you can treat them like variables (store them in variables, pass them as arguments, or return them from other functions).

🧠 Simple Definition

A higher-order function is a function that either takes another function as input or returns a function as output.

🔹 Example 1: Function Taking Another Function
function greetUser(name) {
  return `Hello, ${name}!`;
}

function processUserInput(callback) {
  const name = "Punithan";
  console.log(callback(name));
}

processUserInput(greetUser);


🧩 Explanation:

processUserInput is a higher-order function because it takes another function (greetUser) as an argument.

greetUser is called inside processUserInput.

🔹 Example 2: Function Returning Another Function
function multiplier(factor) {
  return function (number) {
    return number * factor;
  };
}

const double = multiplier(2);
console.log(double(5)); // Output: 10


🧩 Explanation:

multiplier is a higher-order function because it returns another function.

The returned function remembers factor using a closure.

🔹 Example 3: Built-in Higher-Order Functions

Many JavaScript array methods are higher-order functions:

const numbers = [1, 2, 3, 4, 5];

const doubled = numbers.map(num => num * 2);
const evens = numbers.filter(num => num % 2 === 0);
const sum = numbers.reduce((acc, num) => acc + num, 0);

console.log(doubled); // [2, 4, 6, 8, 10]
console.log(evens);   // [2, 4]
console.log(sum);     // 15


🧩 Explanation:

map, filter, and reduce are higher-order because they take callback functions as parameters.

🧭 Why It’s Important

Higher-order functions make your code:

Cleaner and reusable (no need for repetitive loops)

More expressive (you describe what to do, not how)

Functional-programming friendly