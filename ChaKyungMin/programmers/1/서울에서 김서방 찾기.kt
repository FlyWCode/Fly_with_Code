class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""

        seoul.forEachIndexed { index, value ->
            if(value=="Kim")
                answer="김서방은 ${index}에 있다"
        }
        return answer
    }
}