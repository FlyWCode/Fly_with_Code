fun main(){
    val number= readLine()!!.toInt()

    for (i in 1..number){
        // repeat 특정 문자열 or 함수 만큼 반복 i 만큼 반복이니 i 가 1 일때 * 2일때 ** 나간다
       print("*".repeat(i))
        print("\n")
    }
}