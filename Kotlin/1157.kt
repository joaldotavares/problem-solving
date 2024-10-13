import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val entrada = scanner.nextInt()
    var divisor = 1
    while (divisor <= entrada) {
        if (entrada % divisor == 0) {
            println(divisor)
        }
        divisor++
    }
}
