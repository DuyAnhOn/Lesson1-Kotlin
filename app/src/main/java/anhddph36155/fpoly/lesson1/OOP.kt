package anhddph36155.fpoly.lesson1

fun main(){
    var device = Device()

    println("Name is ${device.name}")

    device.turnOn()
    device.turnOff()
}

class Device {
    var name = "Phone"
    var price = "1000"


    fun turnOn(){
        println("Device is turned on")
    }
    fun turnOff(){
        println("Device is turned off")
    }
}