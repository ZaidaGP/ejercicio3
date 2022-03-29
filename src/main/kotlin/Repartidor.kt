
class Repartidor(nombre: String, edad: Int, salario : Float ,zona_p : String) : Empleado(nombre,edad,salario) {


    var zona: String
    init{
        zona = zona_p
    }

    override fun plus() {
        if(this.edad < 25 && this.zona== "zona 3"){
           this.salario= this.salario+PLUS

        }

    }


}