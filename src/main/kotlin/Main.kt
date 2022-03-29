import Repartidor
import Comercial

fun main(args: Array<String>) {
    //println("Hello World!")

    var repartidor = Repartidor("Juan",21, 30f, "zona 3" )

    var comercial= Comercial("Zaida",32,30f,250.0)

    var comercial1 = comercial.plus()
    println(comercial.nombre +" su salario es "+comercial.salario)
    var repartidor1= repartidor.plus()
    println(repartidor.nombre+ " su salarios es "+ repartidor.salario)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

}