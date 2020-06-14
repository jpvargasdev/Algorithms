const CArray = require('./Utils');

// Algorithms
const selectionSort = require('./SelectionSort');
const bubbleSort = require('./BubbleSort');

const list = new CArray();
list.setData();

console.time('BubbleSort');
console.log(bubbleSort(list.dataStore));
console.timeEnd('BubbleSort');

console.time('SelectionSort');
console.log(selectionSort(list.dataStore));
console.timeEnd('SelectionSort');