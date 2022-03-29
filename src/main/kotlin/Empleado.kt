
open abstract class Empleado {


    var nombre: String
    var edad: Int
    var salario: Float

    val PLUS = 300



    constructor(nombre: String, edad: Int, salario: Float){
        this.nombre= nombre
        this.edad = edad
        this.salario= salario
    }


    abstract fun plus()



}