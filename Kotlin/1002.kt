import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val raio = scanner.nextDouble()
    val area = 3.14159 * (raio * raio)
    println(String.format("A=%.4f", area))
}