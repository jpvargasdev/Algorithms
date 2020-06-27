class SortableArray {
  constructor(array) {
    this.array = array;
  }

  swap(pointer1, pointer2) {
    const tmpValue = this.array[pointer1];
    this.array[pointer1] = this.array[pointer2];
    this.array[pointer2] = tmpValue;
  }

  setPartition(leftPointer, rightPointer) {
    this.pivotPosition = rightPointer;
    this.pivot = this.array[this.pivotPosition];

    rightPointer -= 1;

    while(true) {

      while(this.array[leftPointer] < this.pivot) {
        leftPointer += 1;
      }

      while(this.array[rightPointer] > this.pivot) {
        rightPointer -= 1;
      }

      if (leftPointer >= rightPointer) break;
      this.swap(leftPointer, rightPointer);
    }
    
    this.swap(leftPointer, this.pivotPosition);
    return leftPointer;
  }

  quickSort(leftIndex, rightIndex) {

    if(rightIndex - leftIndex <= 0) return;

    const pivotPosition = this.setPartition(leftIndex, rightIndex);
    this.quickSort(leftIndex, pivotPosition - 1);
    this.quickSort(pivotPosition + 1, rightIndex);
  }
}

module.exports = SortableArray;
