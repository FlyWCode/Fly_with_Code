class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        var data = n.toString().toMutableList()


        for(i in 0 until data.size){
            println(data[i])
            answer+=data[i].toInt()-48
        }



        return answer
    }
}

fun main(){
    val solution=Solution()
    solution.solution(1223)
}