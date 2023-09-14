fun main(){
    // Variables y Tipos de Datos Kotlin
    // val para constantes
    // var para varibles

    val name="El Franck"
    var age= 19

    println("Hola soy "+name+ " y tengo ")
    println(""+age+" años")

    //name="franck" las variables val no cambian (inmutables)
    age=21
    age=age+1

    //age="diez" variables var cambian su valor pero no el tipo

    // Especificar tipo fr dato en declaracion

    //desclaracion
    val city: String
    // inicializacion
    city="huamantla"

    // Declaracion e inicializacion
    val isMarried: Boolean=false

    val children: Int =0
    val height: Double=1.68

    println(isMarried)
    println(height)

    // String Templates
    // $ para imprimir valor de variables
    // ${} para procesos antes de imprimir

    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $children hijos")

    println("En 2030 tendre ${children+2} hijos")


}