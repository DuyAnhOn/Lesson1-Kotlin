package anhddph36155.fpoly.lesson1

fun main() {
    //Lab 1
    //Lesson 2
//        print("Đỗ Duy Anh - PS36155\n")
//        print("=========================\n")
//        println("Quanh năm buôn bán ở mom sông")
//        println("Nuôi đủ năm con với một chồng")
//        println("\tlặn lội thân cờ khi quãng vắng")
//        println("\teo sèo mặt nước buổi đò đồng")
//        println("Một duyên hai nợ âu đành phận")
//        println("Năm nắng mười mưa há chẳng công")
//        println("\tCha mẹ thói đời \"ăn ở bạc\"")
//        println("\tCó chồng hờ hững cũng như không")

    //Lesson 3
//    var a = 0.0
//    var b = 0.0
//
//    println("Enter a: ")
//    var s = readLine()
//    if (s != null) a = s.toDouble()
//
//    println("Enter b: ")
//    s = readLine()
//    if (s != null) b = s.toDouble()
//
//    println("$a + $b = ${a.plus(b)}")
//    println("$a - $b = " + (a-b))
//    println("$a * $b = ${a.times(b)}")
//    println("$a  / $b = ${a.div(b)}")

    //Print
//    print("Hi\n")
//    println("It's me")
//    print("\tI'm problem")

    //Varible
//    var a = 1
//    var b = 2
//    b = a
//    println("a = " + a)
//    println("b = " + b)
//    println("$a")
//
//    val c: Int
//    c = 3

    //Array
     var array = intArrayOf(1, 2, 3)
    println(array[2])
    println(array.asList())

    for (arr in array){
        println(arr)
    }

    for (i in array.indices){
        println("Phan tu thu $i la ${array[i]}")
    }

    var list = array.asList().toMutableList()
    list.add(6)
    println(list)
    var list1 = mutableListOf(1,2,3)
    list1.add(3, 4)
    list1.removeAt(list1.size -2)
    println(list1)

    //Function
//    fun sum(a: Int, b: Int): Int{
//        return a+b
//    }

    //Unary Operator
//    var a = 1
//    var b = a.unaryPlus()
//    var c = a.unaryMinus()
//    println(b)
//    println(c)

    //Arithmetic operator
//    var a = 8.plus(2)
//    println(a)
//
//    var b = 10; var c =6
//    var d = b.minus(c)
//    println("$b - $c = $d")
//
//    println(2.times(3))
//
//    println(10.div(2))
//
//    println(10.rem(3))

    //Comparison operator
//    var a = 1; var b = 2; var c =2
//    println(a.equals(b))
//    println(!a.equals(b))
//    println(b.compareTo(a))
//    println(c.compareTo(b))
//    println(a.compareTo(c))

}