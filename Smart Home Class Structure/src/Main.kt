open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }
}

fun main() {
    val smartTvDevice = SmartDevice()
    println("Device Name is ${smartTvDevice.name}")
    smartTvDevice.turnon()
    smartTvDevice.turnoff()
}