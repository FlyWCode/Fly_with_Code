import java.util.*
import kotlin.math.log

// 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/42586


class 기능개발 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {

        // 두개의 list를 하나로 묶어준다.
        // val ml = mutableListOf(5, 4, 1, 2, 3, 6)
        // val ml2 = mutableListOf("a", "c", "b", "e", "d", "f")
        // a5, c4, b1, e2, d3, f6
        val days = progresses.zip(speeds).map { (p, s) -> // p -> progresses s -> speeds
            // zip을 써서 하는 이유 각각 list map 하는거보단 합쳐서 하는게 가독성이 좋아서 ?
            val left = 100 - p //p가 93 이라면 left -> 7 7일남았고
            val div = left / s //  s가 1이라면 7일걸린다. // 남은 기간
            val mode = if (left % s > 0) 1 else 0 // 만약 소수점이 생기면 1을 더해준다.
            div + mode // 남은 기간 반호나값
        }

        val stack = Stack<Pair<Int, Int>>() // 스택 생성 첫번째 값에는 남은기간, 두번째 값에는 얼마나 걸리는지.
        stack.push(Pair(days.first(), 1)) // 맨아래 스택 추가.

        for (day in days.drop(1)) { // for 문으 돌려 값을 구한다. 마지막 인덱스 까지 돌리기 위해 drop(1)을 사용한다. ==
            if (day <= stack.peek().first) { // stack의 peek 가장 위에있는 항목을 반환한다., first 이므로 남은기간.
                print(stack.size - 1)
                val (a, b) = stack[stack.size - 1] // a와 b에 stack.first stack secnod가 들어간다.
                stack[stack.size - 1] = Pair(a, b + 1) // second에 1를 더해준다. 아직 기간이 남았으므로
            } else {
                stack.push(Pair(day, 1)) // 남은 기간이 없으면 push해 넣어준다.
            }

        }
        return stack.map { it.second }.toIntArray()


    }
}

fun main() {
    val solution = 기능개발()
    print(solution.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5)))
}
