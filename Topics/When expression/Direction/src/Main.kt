
fun main() {
    for (i in 1..3) {
        if (i == 1)
            continue
        println("$i")
      //  println(1)
        loop@ for (j in 1..2) {
            for (k in 1..2) {
                if (i == 2 || j == 3) break@loop
                println("$j")
                println("$k")
              //  println(2)
            }
            if (j == 1) return
         //   println(3)
        }
    }
}
