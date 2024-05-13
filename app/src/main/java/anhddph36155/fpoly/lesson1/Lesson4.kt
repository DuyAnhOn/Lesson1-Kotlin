package anhddph36155.fpoly.lesson1

import androidx.compose.ui.text.toUpperCase

fun main(){
    val tinhTong = {a: Int, b: Int -> {
        var a = 5; var b =6
        (a+b) }
        println("${tinhTong(a, b)}")
    }

    var a = 5
    var nhanDoi2 = a.let { it * 2 }
    println("${nhanDoi2}")

    var name = "Do Duy Anh"
    var nameUpper =
    with(name){
        name.toUpperCase()
    }
    println(nameUpper)

}

val tinhTong: (Int, Int) -> Int = {
    a: Int, b: Int -> (a+b)}