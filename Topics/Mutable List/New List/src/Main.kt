fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val nList = numbers.toMutableList()
    nList += number
    return nList
}