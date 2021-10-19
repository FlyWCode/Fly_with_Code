/*
문제 : https://programmers.co.kr/learn/courses/30/lessons/87389
 */
class Solution {
    fun solution(n: Int): Int {
        var answer=0

        for(i in 1..n){
            if(n%i==1){
                answer=i
                break
            }
            else{
                answer=i
            }
        }
        return answer
    }
}

fun main(){
    val solution=Solution()
    print(solution.solution(10))
}