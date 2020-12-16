fun main() {

    val n1 = 1
    val n2 = 2
    val n3 = 3

    if (n1 >= n2 && n1 >= n3)
        println("Largest:$n1")
    else if (n2 >= n1 && n2 >= n3)
        println("Largest:$n2")
    else
        println("Largest:$n3")
}
