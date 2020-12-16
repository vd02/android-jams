fun main() {
    var fac: Int =1
    val num: Int=3
    var sum: Int=0
    for (i in 1..num)
    {
        for (j in 1..i)
    {
       fac=fac*j
    }
    sum=sum+fac
    fac=1
    }
    println(sum)
}
