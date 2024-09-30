import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var menor = 1000
    var posicao = 0

    val entradas = scanner.nextInt()
    for (i in 1 .. entradas) {
        val valor = scanner.nextInt()
        if(valor < menor) {
            menor = valor
            posicao = i-1
        }
    }
    println("Menor valor: $menor")
    println("Posicao: $posicao")
}