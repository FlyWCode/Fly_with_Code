### 문제 풀이

```
import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var value : Long = 1

    val count = sc.nextInt()

    for(num in 1..count){
        val tastCaseA = sc.nextInt()
        val tastCaseB = sc.nextInt()

        for(num1 in 1..tastCaseB){
           value = (value*tastCaseA%10).toLong()
        }
        println(value)
        value = 1
    }

}
```
