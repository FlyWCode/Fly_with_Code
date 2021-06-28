package 입출력

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val N = nextInt()
    for (i in 1..9) {
        print("$N * $i = ${N*i}\n")
    }
}