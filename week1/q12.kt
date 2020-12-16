fun main() {
    val n = 9474
    var n1: Int
    var a: Int
    var sum = 0
    var n2 = 0

    n1 = n

    while (n1 != 0) {
        n1 = n1/10
        ++n2
    }

    n1 = n

    while (n1 != 0) {
        a = n1 % 10
        sum =sum+ Math.pow(a.toDouble(), n2.toDouble()).toInt()
        n1 = n1/10
    }

    if (sum == n)
        println("Armstrong number.")
    else
        println("Not an Armstrong number.")
}
