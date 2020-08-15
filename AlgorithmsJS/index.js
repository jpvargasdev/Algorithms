const CArray = require('./Utils');

// Algorithms
const selectionSort = require('./SelectionSort');
const bubbleSort = require('./BubbleSort');
const insertionSort = require('./InsertionSort');
const SortableArray = require('./QuickSort');
const SortableArray2 = require('./QuickSelect');

// const list = new CArray(40);
// list.setData();

// console.log('///// ARRAY TO ORDER /////');
// console.log(list.dataStore);
// console.log('//////////////////////////');

// console.time('QuickSort');
// const sortableArray = new SortableArray([...list.dataStore]);
// sortableArray.quickSort(0, list.dataStore.length - 1);
// console.log(sortableArray.array)
// console.timeEnd('QuickSort');

// console.time('BubbleSort');
// console.log(bubbleSort([...list.dataStore]));
// console.timeEnd('BubbleSort');

// console.time('SelectionSort');
// console.log(selectionSort([...list.dataStore]));
// console.timeEnd('SelectionSort');

// console.time('InsertionSort');
// console.log(insertionSort([...list.dataStore]));
// console.timeEnd('InsertionSort');

const array = [0, 50, 20, 10 ,60, 30];
const sortableArray = new SortableArray2(array);
console.log(sortableArray.quickSelect(1, 0, array.length - 1));