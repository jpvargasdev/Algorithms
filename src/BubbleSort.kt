/**
 * Bubble Sort function O(N^2) - O(N)
 */
fun bubbleSort(list : Array<Int>) : Array<Int>{
    var unsortedUntilIndex : Int = list.size - 1
    var isSorted = false

    while(!isSorted) {
        isSorted = true
        for (i in 0 until unsortedUntilIndex) {
            if (list[i] > list[i + 1]) {
                isSorted = false
                val lastNumber = list[i]
                list[i] = list[i + 1]
                list[i + 1] = lastNumber
            }
        }
        unsortedUntilIndex -= 1
    }

    return list
}