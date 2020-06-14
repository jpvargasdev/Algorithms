/**
 * Bubble Sort function O(N^2)
 */
function bubbleSort(list) {
  let unsortedUntilIndex = list.length
  let isSorted = false;

  while(!isSorted) {
    isSorted = true;
    for (let i = 0; i < unsortedUntilIndex; i++) {
      if (list[i] > list[i+1]) {
        isSorted = false;
        const lastNumber = list[i];
        list[i] = list[i + 1];
        list[i+1] = lastNumber;
      }
    }
    unsortedUntilIndex -=1;
  }

  return list;
}

module.exports = bubbleSort;
