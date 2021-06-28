package 입출력

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    for (i in 1..nextInt()) {
        val a = next()

        val array = a.split(",".toRegex())
        println(array[0].toInt() + array[1].toInt())
    }

}