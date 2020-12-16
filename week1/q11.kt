fun main() {
    val n = 371
    var n1: Int
    var r: Int
    var sum=0

    n1=n

    while (n1 != 0) {
        r=n1%10
       sum=sum+Math.pow(r.toDouble(), 3.0).toInt()
        n1=n1/10
    }

    if (sum==n)
        println("Armstrong number.")
    else
        println("Not an Armstrong number.")
}
