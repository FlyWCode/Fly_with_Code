import java.lang.Exception

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        val noHave = n - lost.size

        val lostList = lost.sorted().toMutableList()
        val reserveList = reserve.sorted().toMutableList()


        // 만약 reserve랑 lost랑 같은 체육복이 있으면 지워준다.
      reserve.filter {
          lostList.contains(it)
      }.forEach{
          lostList.remove(it)
          reserveList.remove(it)
      }

      // reserve +1, -1 비교해서 lost에 있으면 지워준다.
        reserveList.forEach {
            when{
                lostList.contains(it-1)->lostList.remove(it-1)
                lostList.contains(it+1)->lostList.remove(it+1)
            }
        }
        return n-lostList.size

    }
}
