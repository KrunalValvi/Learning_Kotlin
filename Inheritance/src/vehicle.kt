open class vehicle {

    var brand: String = "Unknown"
    var model: String = "Unknown"

    fun start() {
        println("Vehical is starting.")
    }

    fun stop() {
        println("Vehical is Stopping.")
    }
}

open class car : vehicle() {

    var year: Int = 0

    fun display(){
        println("Car Brand:$brand, Model:$model, Year:$year")
    }
}