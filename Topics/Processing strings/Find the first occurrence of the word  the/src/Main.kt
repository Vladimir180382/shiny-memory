fun main() {
    val str = readLine()!!.lowercase()
    var j = -1 
      for (i in 0..str.length - 1) {
       if (str[i] == 't' && str[i + 1] == 'h' && str[i + 2] == 'e') { 
          j = i
         break
         }
      }
    println(j) 
}
