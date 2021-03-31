fun main() {
    var gari=Car("Subaru","mercedees",40,"white")
    gari.carry(9)
    println("I am a ${gari.make} ${gari.model} ${gari.capacity} ${gari.colour}")
    println(gari.calculateParkingFee(4))

    var basi=Bus("probox","Toyota",40,"black")
    println(basi.maxTripFare(7543.34.toDouble()))
    println(basi.maxTripFare(7543.34.toDouble()*basi.capacity))
    println(basi.calculateParkingFee(10))


}
open class Matatu(var make: String,var model:String,var capacity: Int,var colour: String){
    fun carry(crowd:Int) {
        var crowd = -capacity
        if (crowd <= capacity) {
            println("carry $crowd passengers")

        } else {
            println("over capacity by $crowd")
        }

    }
      open fun calculateParkingFee(hours:Int):Int{
             return  hours*20
         }
}
class Car(make: String,model: String,capacity: Int,colour: String): Matatu(make, model, capacity, colour){

}
class Bus( make:String, model: String, capacity: Int, colour: String):Matatu(make, model, capacity, colour){
    fun maxTripFare(fare:Double):Double{
        var x=0
        return x+fare
    }
    override fun calculateParkingFee(hours: Int):Int{
        return hours*capacity

    }
}


