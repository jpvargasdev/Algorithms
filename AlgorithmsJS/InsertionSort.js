function insertionSort(list) {
  for (let index = 1; index < list.length; index++) {
    let position = index;
    let temp_value = list[position];

    while( position > 0 && list[position - 1] > temp_value ) {
      list[position] = list[position - 1];
      position--;
    }

    list[position] = temp_value;
  }

  return list;
}

module.exports = insertionSort;