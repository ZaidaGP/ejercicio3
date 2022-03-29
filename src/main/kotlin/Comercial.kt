class Comercial(nombre: String, edad: Int, salario: Float, comision_p: Double) : Empleado(nombre,edad,salario) {

    var comision: Double

    init{
        comision= comision_p
    }


    override fun plus() {
       if(this.edad>30 && this.comision>200){
           this.salario = this.salario+PLUS
       }
    }


}