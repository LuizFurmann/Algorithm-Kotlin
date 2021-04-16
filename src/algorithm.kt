import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    print("********************")
    TimeUnit.SECONDS.sleep(1) // delay 1 second
    print("*****Algorithm******")
    TimeUnit.SECONDS.sleep(1)
    println("********************")
    TimeUnit.SECONDS.sleep(1)

    do {
        println("\n*-------------------------------*")
        println("| 1 - Find the duplicate number |")
        println("| 2 - Lambda                    |")
        println("| 3 - Recursion                 |")
        println("| 0 - Exit                      |")
        println("*-------------------------------*\n")
        print(">> ")
        val op = readLine()?.toInt()

        if (op == 0) {
            println("Exit")
            break
        } else if (op == 1) {
            val list = listOf(1, 2, 3, 5, 2)
            println("val list = listOf(1, 2, 3, 5, 2)")
            println("\nvalor:vezes na lista - " + list.groupingBy { it }.eachCount().filter { it.value > 1 })
        } else if (op == 2) {
            val lambda1: (Int, Int) -> Int = { y, x -> y + x }
            val lambda2 = { x: Int, y: Int -> y + x }
            println("val lambda1: (Int, Int) -> Int = { y, x -> y + x }")
            println("lambda1 x = 5 + y = 5 = " + lambda1(5, 5))
            println("\nval lambda2 = { x: Int, y: Int -> y + x }")
            println("\nlambda2 x = 2 + y = 2 = " + lambda2(2, 2))
        } else if (op == 3) {
            print("Chooce a number: ")
            val n1 = readLine()?.toInt()
            println("\nThe result is " + n1?.let { factori(it) })
        }
    }while(true)
}
fun factori(n: Int): Int{
    if(n == 1) return 1
    return n * factori(n - 1)
}