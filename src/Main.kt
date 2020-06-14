fun main(args: Array<String>) {
    val cArray : CArray = CArray()
    cArray.setData()
    bubbleSort(cArray.dataStore)
    println(cArray.getString())
    selectionSort(cArray.dataStore)
    println(cArray.getString())
}