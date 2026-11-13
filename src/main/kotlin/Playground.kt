fun main() {
    val nombreDelGimnasio: String = "Hybryd Gym"
    var cantidadDeTurnosDisponibles: Int = 3


    print("Por favor ingrese su nombre de Usuario: ")
    var ingresarNombre = readln()
    val nombreDeUsuario: String = if (ingresarNombre.isBlank()) "Invitado" else ingresarNombre

    print("Ingrese su edad: ")
    val edad: Byte = readln().toByte()

    print("Ingrese la cantidad de clases restantes: ")
    val saldo: Double = readln().toDouble()

    when {
        edad < 18 -> println("Acceso denegado: menor de edad.")
        saldo <= 0 -> println("Acceso denegado: cuota pendiente")
        cantidadDeTurnosDisponibles <= 0 -> println("Acceso denegado: sin turnos disponibles")
        else -> {
            println("Acceso concedido a $nombreDeUsuario en $nombreDelGimnasio.")
            cantidadDeTurnosDisponibles--
        }

    }
    println("Cantidad de clases disponibles en $nombreDelGimnasio: $cantidadDeTurnosDisponibles")
}