fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"Ade")
    map.put(2,"Danvi")
    map.put(3,"Jadi Ade Danvi")
    println(map.get(3))

    map.put(3,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }
}