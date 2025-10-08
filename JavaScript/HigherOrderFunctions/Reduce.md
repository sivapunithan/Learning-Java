🔹 What is reduce()?

reduce() is a higher-order array function that loops through all elements of an array and reduces them into a single final value (which can be a number, string, object, or array).

Syntax:

array.reduce((accumulator, currentValue) => {
   // logic to update accumulator
   return accumulator;
}, initialValue);


accumulator → carries the result of previous iterations (a container).

currentValue → the element currently being processed.

initialValue → starting point for the accumulator (e.g. 0, [], {}).

🔹 Why it’s powerful

Unlike map() or filter() that always return arrays, reduce() can build any type of result:

Totals and averages

Grouped data

Frequency counters

Flattened arrays

Aggregated reports

It’s the backbone for transforming raw data into usable shapes.

🔹 Simple example – Summing numbers
const arr = [1, 2, 3, 4];
const sum = arr.reduce((acc, curr) => acc + curr, 0);
console.log(sum); // 10

🔹 Real-world example – Asset table
const assets = [
  { category: "Laptop", qty: 5, unitPrice: 55000 },
  { category: "Monitor", qty: 10, unitPrice: 15000 },
  { category: "Keyboard", qty: 15, unitPrice: 1500 },
  { category: "Laptop", qty: 3, unitPrice: 48000 },
];

// total value by category
const valueByCategory = assets.reduce((acc, curr) => {
  const total = curr.qty * curr.unitPrice;
  acc[curr.category] = (acc[curr.category] || 0) + total;
  return acc;
}, {});

console.log(valueByCategory);
// { Laptop: 435000, Monitor: 150000, Keyboard: 22500 }


✅ Here reduce() groups and aggregates data just like real CRUD dashboards.