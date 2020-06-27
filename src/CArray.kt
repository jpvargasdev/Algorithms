import kotlin.random.Random

class CArray(private val numElements : Int = 100) {
    var dataStore : Array<Int> = Array(numElements) {0}
    private var pos : Int = 0

    init {
        for (i in 0 until numElements) {
            this.dataStore[i] = i
        }
    }

    fun setData() {
        for (i in 0 until numElements) {
            this.dataStore[i] = Random.nextInt(0, 99)
        }
    }

    fun clear() {
        for (i in dataStore.indices) {
            this.dataStore[i] = 0
        }
    }

    fun insert(element: Int) {
        this.pos += 1
        this.dataStore[this.pos] = element
    }

    fun getString(array: Array<Int>): String {
        var retstr = ""
        for (i in array.indices) {
            retstr += array[i].toString() + " "
            if (i > 0 && i % 10 == 0) {
                retstr += "\n"
            }
        }
        return retstr
    }

    fun swap(array: IntArray, index1: Int, index2: Int) {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    }
}