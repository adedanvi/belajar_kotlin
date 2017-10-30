fun main(args: Array<String>) {
    var map=HashMap<String,String>()
    map.put("nama_depan","Ade")
    map.put("nama_tengah","Danvi")
    map.put("nama_belakang","Jadi Ade Danvi")
    println(map.get("nama_depan"))

    map.put("nama_tengan","Unisnu Jepara")
    for (k in map.keys){
        println(k +" "+map.get(k))
    }
}