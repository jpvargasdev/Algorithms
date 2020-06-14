class CArray {
  constructor(numElements = 100) {
    this.dataStore = [];
    this.pos = 0;
    this.numElements = numElements;
    this.toString = toString;

    for (let i = 0; i < numElements; ++i) {
      this.dataStore[i] = i;
    }
  }

  setData() {
    for (let i = 0; i < this.numElements; ++i) {
      this.dataStore[i] = Math.floor(
          Math.random()
          * (this.numElements + 1)
        );
    }
  }

  clear() {
    for (let i = 0; i < this.dataStore.length; ++i) {
      this.dataStore[i] = 0;
    }
  }

  insert(element) {
    this.dataStore[this.pos++] = element;
  }

  toString() {
    let retsrt = "";
    for (let i = 0; i < this.dataStore.length; ++i) {
      retstr += this.dataStore[i] + " ";
      if (i > 0 && i % 10 === 0) {
        restr += "\n";
      }
    }
    return retsrt;
  }

  swap(arr, index1, index2) {
    const temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = arr[temp];
  }
}

module.exports = CArray;