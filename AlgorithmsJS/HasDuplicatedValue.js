const CArray = require('./Utils');

/**
 * Has duplicate value function O(N^2)
 */
function hasDuplicatedValue(list) {
  const listSize = list.length
  for(let i = 0; i < listSize; i++ ) {
    for(let j = 0; j < listSize; j++ ) {
      if(i !== j && list[i] === list[j]) {
        return true;
      }
    }
  }
  return false;
}

/**
 * Has duplicate value function O(N)
 */
function hasDuplicatedValue2(list) {
  const listSize = list.length
  const existingNumbers = [];
  for (let i = 0; i < listSize; i++) {
    if (existingNumbers[list[i]] === undefined) {
      existingNumbers[list[i]] = 1;
    } else {
      return true;
    }
  }
  return false;
}

const list = new CArray(1000)
list.setData();
console.time('hasDuplicatedValue');
console.log(hasDuplicatedValue(list.dataStore));
console.timeEnd('hasDuplicatedValue');

console.time('hasDuplicatedValue2');
console.log(hasDuplicatedValue2(list.dataStore));
console.timeEnd('hasDuplicatedValue2');
