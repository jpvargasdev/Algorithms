package algorithms

/**
 * Selection Sort function O(N^2 / 2)
 */
fun selectionSort(list: Array<Int>) : Array<Int> {
    for (i in list.indices) {
        var lowerNumberIndex : Int = i
        for (j in i until list.size) {
            if (list[j] < list[lowerNumberIndex]) {
                lowerNumberIndex = j
            }
        }

        if (lowerNumberIndex != i) {
            val temp = list[i]
            list[i] = list[lowerNumberIndex]
            list[lowerNumberIndex] = temp
        }
    }

    return list
}