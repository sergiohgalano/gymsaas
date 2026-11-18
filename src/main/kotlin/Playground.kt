data class Usuario(
    val id: Int,
    val nombre: String,
    var saldo: Double
) {
    // Función (método) dentro de la clase
    fun pagarCuota(monto: Double) {
        saldo += monto
        println("$nombre pagó $$monto. Nuevo saldo: $$saldo")
    }
}

data class Gimnasio(
    val nombre: String,
    val direccion: String,
    var turnosDisponibles: Int
) {
    // Función para intentar reservar un turno
    fun reservarTurno(usuario: Usuario) {
        if (turnosDisponibles > 0 && usuario.saldo >= 0) {
            turnosDisponibles--
            println("${usuario.nombre} reservó un turno en $nombre.")
        } else {
            println("No se pudo reservar el turno para ${usuario.nombre}.")
        }
    }
}

fun main() {
    // 1. Creamos los objetos
    val usuario = Usuario(id = 1, nombre = "Sergio", saldo = -500.0) // Arranca debiendo plata
    val gimnasio = Gimnasio(nombre = "Hybryd Gym", direccion = "Av. Siempre Viva 123", turnosDisponibles = 2)

    // 2. Llamamos a los métodos (comportamiento)
    println("--- Intento de reserva con deuda ---")
    gimnasio.reservarTurno(usuario)

    println("\n--- Sergio paga la cuota ---")
    usuario.pagarCuota(1500.0)

    println("\n--- Nuevo intento de reserva ---")
    gimnasio.reservarTurno(usuario)
}