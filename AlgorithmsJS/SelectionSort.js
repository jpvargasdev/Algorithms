/**
 * Selection Sort function O(N^2 / 2)
 */
function selectionSort(list) {
  const listLength = list.length;
  for (let i = 0; i < listLength; i++) {
    let lowerNumberIndex = i;
    for (let j = i; j < listLength; j ++) {
      if (list[j] < list[lowerNumberIndex]) {
        lowerNumberIndex = j;
      }
    }

    if (lowerNumberIndex != i) {
      const temp = list[i];
      list[i] = list[lowerNumberIndex];
      list[lowerNumberIndex] = temp;
    }
  }

  return list;
}

module.exports = selectionSort;
