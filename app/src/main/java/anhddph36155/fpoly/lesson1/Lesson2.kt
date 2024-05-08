package anhddph36155.fpoly.lesson1

fun main(){
    println("Enter student's name: ")
    var s = readLine()
    if (s != null){
        println(getID(s))
    }
}

private var MAP_Student: Map<String, String> = mutableMapOf("Do Duy Anh" to "PH36155", "Vuong Thuy Trang"  to "PH200804")

fun getID(name: String): String? {
    when (name){
        "Do Duy Anh" ->{
            var ID = MAP_Student.get(name)
            return ID
        }
        "Vuong Thuy Trang" ->{
            return "PH200804"
        }
    }
    return "No data"
}