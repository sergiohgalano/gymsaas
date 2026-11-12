fun main() {
    val nombreDeUsuario: String? = "Sergio"
    val gimnasio: String = "Hybryd Gym"

    // El "?" después del nombre de la variable dice: "si es nulo, no hagas nada"
    val cantidadDeLetras = nombreDeUsuario?.length

    println("El nombre tiene $cantidadDeLetras letras.")
}