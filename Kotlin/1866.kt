import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val entradas = scanner.nextInt()
    for (i in 1 .. entradas) {
        val valor = scanner.nextInt()
        if(valor % 2 == 0) {
            println("0")
        } else {
            println("1")
        }
    }
    scanner.close()
}
