> 풀이

```
fun main(){
    var least = 1000000
    var least2 = 1000000
    var hamberger = arrayOf(0,0,0)
    var Drinks = arrayOf(0,0)

    for(integer in 0..2)
       hamberger[integer] = readLine()!!.toInt()

    for(integer in 0..1)
        Drinks[integer] = readLine()!!.toInt()

    for(integer in 0..2)
        if(hamberger[integer]<least)
            least=hamberger[integer]

    for(integer in 0..1)
        if(Drinks[integer]<least2)
            least2=Drinks[integer]

    println(least+least2-50)
}
```

[상근날드문제](https://www.acmicpc.net/problem/5543)
