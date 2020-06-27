/**
 * Insertion sort function O(N^2) - O(N)
 */
fun insertionSort(list: Array<Int>) : Array<Int>{
    for(i in 1 until list.size) {
        var position = i
        val tmpValue = list[position]

        while (position > 0 && list[position - 1] > tmpValue) {
            list[position] = list[position - 1]
            position -= 1
        }

        list[position] = tmpValue
    }

    return list
}