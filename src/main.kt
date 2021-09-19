import kotlin.math.abs

fun main(args: Array<String>){
    var guess = 0.0
    print("enter the temperature you wish to check: \n")
    guess = readLine()!!.toDouble()
    if (guess <= 97.5 )
        println("Low")
    else if ( guess <= 99.5)
        println("normal")
    else if (guess >= 99.5 )
        println("High")
    }

