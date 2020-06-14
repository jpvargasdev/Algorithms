/**
 * Selection Sort function O(N^2 / 2)
 */
fun selectionSort(list: Array<Int>) {
    val listSize = list.size
    for (i in 0 until listSize) {
        var lowerNumberIndex : Int = i
        for (j in i until listSize) {
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
}