import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var saida = scanner.nextInt()

    while (saida != 0) {
        var maria = 0
        var joao = 0
        for (i in 1..saida) {
            val jogada = scanner.nextInt()
            when (jogada) {
                0 -> maria++
                1 -> joao++
            }

        }
        println("Mary won $maria times and John won $joao times")
        saida = scanner.nextInt()
    }
    scanner.close()
}
