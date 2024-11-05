fun main() {
    println("Ingrese su peso en kg:")
    val peso = readLine()!!.toDouble()

    println("Ingrese su estatura en metros:")
    val estatura = readLine()!!.toDouble()

    // Cálculo del IMC
    val imc = peso / (estatura * estatura)

    // Clasificación según el IMC
    val clasificacion = when {
        imc < 16.0 -> "Delgadez severa"
        imc in 16.0..16.99 -> "Delgadez moderada"
        imc in 17.0..18.49 -> "Delgadez leve"
        imc in 18.5..24.99 -> "Normal"
        imc in 25.0..29.99 -> "Preobeso"
        imc in 30.0..34.99 -> "Obesidad leve"
        imc in 35.0..39.99 -> "Obesidad media"
        else -> "Obesidad mórbida"
    }

    println("Su IMC es: $imc")
    println("Clasificación: $clasificacion")
}
