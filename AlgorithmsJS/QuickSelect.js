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

      if (
        leftPointer >= this.array.length
        || rightPointer >= this.array.length
      ) break;

      this.swap(leftPointer, rightPointer);
    }
    
    this.swap(leftPointer, this.pivotPosition);

    return leftPointer;
  }

  quickSelect(lowestValue, leftIndex, rightIndex) {

    if(rightIndex - leftIndex <= 0) return this.array[leftIndex];

    const pivotPosition = this.setPartition(leftIndex, rightIndex);

    if (lowestValue < pivotPosition) {
      this.quickSelect(lowestValue, leftIndex, pivotPosition - 1);
    } else if (lowestValue > pivotPosition) {
      this.quickSelect(lowestValue, pivotPosition + 1, rightIndex);
    } else {
      return this.array[pivotPosition];
    }
  }
}

module.exports = SortableArray;
