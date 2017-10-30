fun display(n:Int=0):Unit{
    println("n:$n")
}

fun displyNoInput():Unit{
    println("welcome to display")
}

fun main(args: Array<String>) {
    display(10)
    display()
    displyNoInput()
}