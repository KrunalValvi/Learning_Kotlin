open class shape(){
    open fun draw(){
        println("Drawing a Shape")
    }
}

class Circle : shape(){
    override fun draw(){
        println("Drawing a Circle")
    }
}

fun main(){

    val shape: shape = Circle()
    shape.draw()
}