fun main(args: Array<String>) {
    var arraylist = ArrayList<String>()
    arraylist.add("Ade")
    arraylist.add("Danvi")
    arraylist.add("Jadi Ade danvi")
    arraylist.add("Jepara")

    println("nama pertama : "+ arraylist.get(0))
    println("all element by object")
    for (item in arraylist){
        println(item)
    }

    arraylist.set(0,"Unisnu jepara")

    println("all element by index")
    for (index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    if(arraylist.contains("Mbah")){
        println("name is found")
    }else{
        println("name is not found")
    }
}