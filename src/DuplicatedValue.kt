/**
 * Has duplicated value O(N^2)
 */
fun hasDuplicatedValue(list: Array<Int>) : Boolean {
    val listSize : Int = list.size
    for (i in 0 until listSize) {
        for (j in 0 until listSize) {
            if (
                i != j
                && list[i] == list[j]
            ) {
                return true
            }
        }
    }
    return false
}