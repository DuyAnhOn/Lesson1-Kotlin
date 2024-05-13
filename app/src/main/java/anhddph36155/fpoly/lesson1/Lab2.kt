package anhddph36155.fpoly.lesson1

fun main(){
    do {
        println("1: Phương trình ax+b")
        println("2: Month")
        println("3: Năm nhuận")
        println("4: Thoát")
        println("Nhập lựa chọn: ")

        var choice = 0
        var s = readLine()
        choice = s?.toIntOrNull() ?: 0

        when(choice){
            1 -> lesson1()
            2 -> lesson2()
            3 -> lesson3()
            else -> println("Vui lòng nhập lại")
        }
    } while (choice != 4)

}

fun lesson1(){
    //Phương trình ax+b=0
    var a = 0.0
    var b = 0.0

    println("Enter a: ")
    var s = readLine()
    if (s != null){
        a = s.toDouble()
    }

    println("Enter b: ")
    s = readLine()
    if (s != null){
        b = s.toDouble()
    }

    if (a == 0.0 && b == 0.0){
        println("Phương trình vô số nghiệm")
    } else if(a == 0.0 && b != 0.0){
        println("Phương trình vô nghiệm")
    } else{
        println("Phương trình có nghiệm là x = ${-b/a}")
    }
}

fun lesson2(){
    var month = 0

    println("Enter month: ")
    var s: String? = readLine()
    if (s != null) {
        month = s.toInt()
    }

    when(month){
        1, 2, 3 -> println("Tháng $month thuộc quý 1")
        4, 5, 6 -> println("Tháng $month thuộc quý 2")
        7, 8, 8 -> println("Tháng $month thuộc quý 3")
        10, 11, 12 -> println("Tháng $month thuộc quý 4")
        else -> println("Tháng không hợp lệ")
    }
}

fun lesson3(){
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}