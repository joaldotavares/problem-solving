import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    var entrada = scanner.nextInt()
    var cont = 0
    while (cont < 6) {
        if (entrada % 2 != 0) {
            println(entrada)
            entrada++
            cont++
        } else {
            entrada++
        }
    }
}
