class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var min: Long = n.toLong()/times.size* times.minOf { it }!!.toLong()
        var max: Long = times.maxOf { it }!!.toLong() * n // time의 최댓값 x n  10x 6

        // 6/2*7
        // c최댓값 60 최솟값  21

        while (min <= max) {
            val mid = (min+max)/2 // 중간값 40

            println("max : ${max} min : ${min} mid : ${mid}")

            // 현재 시간 안에 n명의 사람을 모두 심사할 수 있는지
            // 7분의 심사관은 5명, 10분의 심사관은 4명 9명의 사람을 받을 수 있다.
            var sum: Long = 0
            times.forEach {
                sum += mid/it
                println("mid/it : ${mid/it}")

            }
            println("sum : ${sum} ")


            // 모두 심사 가능한 경우
            // 더 짧은 시간으로 가능한지 확인
            // sum이 현재 인원보다 크무로 중간값을 좁혀준다.
            if (sum >= n) max = mid-1

            // 모두 심사 가능하지 않은 경우
            // 더 많은 시간 필요
            // 만약 현재 인원보다 작으면 중간값을 넓혀준다.
            else min = mid + 1
        }
        println("max :${max}")

        return max + 1
    }
}
