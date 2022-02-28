fun main() {
    val str = readLine()!!.toString().lowercase()
    val sumc = str.length - str.replace("c", "").length
    val sumg = str.length - str.replace("g", "").length
    val sumcg = sumc + sumg
    val result = sumcg.toDouble() / str.length
    val procent = result * 100
    println("${procent}")
}
