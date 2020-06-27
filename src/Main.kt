fun main(args: Array<String>) {
    val cArray : CArray = CArray(20)
    cArray.setData()

    println("///// ARRAY TO ORDER /////")
    println(cArray.getString(cArray.dataStore))
    println("//////////////////////////")

    println("QuickSort")
    val sortableArray: SortableArray = SortableArray(cArray.dataStore.copyOf())
    sortableArray.quickSort(0, cArray.dataStore.size - 1)
    println(cArray.getString(sortableArray.array))

    println("InsertionSort")
    println(cArray.getString(insertionSort(cArray.dataStore.copyOf())))

    println("BubbleSort")
    println(cArray.getString(bubbleSort(cArray.dataStore.copyOf())))

    println("SelectionSort")
    println(cArray.getString(selectionSort(cArray.dataStore.copyOf())))
}