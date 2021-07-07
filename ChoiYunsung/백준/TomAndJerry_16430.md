

> 서로소를 직접 걸러내보기
```
fun main(args: Array<String>){
    
    var arrayA =  intArrayOf(1,1,1)
    var arrayB =  intArrayOf(1,1,1,1)
    var posnumA = 0
    var posnumB = 0
    var sorosu = 0

    var A : Int = readLine()!!.toInt()
    var B : Int = readLine()!!.toInt()

       for(loop in 1..9){
           if(A%loop == 0)
           { arrayA[posnumA] = loop
           posnumA++}
           if(B%loop == 0)
           {arrayB[posnumB] = loop
           posnumB++ }
       }

   for (ifsameA in 0..posnumA-1){
       for (ifsameB in 0..posnumB-1)
           if(arrayA[ifsameA] == arrayB[ifsameB] )
           {
                sorosu++
           }
   }
    if(sorosu==1){
        println(B-A)
        println(B)
    }
}
```

[톰과제리 문제](https://www.acmicpc.net/problem/16430)
