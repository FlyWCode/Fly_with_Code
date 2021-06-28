package 입출력

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    for (i in 1..x) {
        var a = nextInt()
        var b = nextInt()
        println("Case #${i}: ${a + b}")
    }

}