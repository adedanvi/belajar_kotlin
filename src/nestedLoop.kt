fun main(args: Array<String>) {
    for(i in 1..5){
        println("*")
    }

    for(i in 1..5){
        for(x in 1..5)
            print("*")
    }

    for (i in 1..5){
        for (x in 1..5)
            print("*")
        println("")
    }

    for (i in 1..5){
        for (i in 1..5){
            for(x in 1..i)
                print("*")
            println()
        }
    }
}