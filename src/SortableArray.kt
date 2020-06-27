class SortableArray(array: Array<Int>) {
    val array : Array<Int> = array
    var pivotPosition : Int = 0
    var pivot : Int = 0

    fun swap(pointer1: Int, pointer2: Int) {
        val tmp = array[pointer1]
        array[pointer1] = array[pointer2]
        array[pointer2] = tmp
    }

    fun setPartition(left: Int, right: Int) : Int {
        var rightPointer = right
        var leftPointer = left
        pivotPosition = rightPointer
        pivot = array[pivotPosition]

        rightPointer--

        while(true) {

            while(array[leftPointer] < pivot) {
                leftPointer++
            }

            while(array[rightPointer] > pivot) {
                rightPointer--
            }

            if (leftPointer >= rightPointer) break
            swap(leftPointer, rightPointer)
        }

        swap(leftPointer, pivotPosition)
        return leftPointer
    }

    fun quickSort(leftIndex: Int, rightIndex: Int) {
        if (rightIndex - leftIndex <= 0) return

        val pivotPosition: Int = setPartition(leftIndex, rightIndex)
        quickSort(leftIndex, pivotPosition - 1)
        quickSort(pivotPosition + 1, rightIndex)
    }
}