package anhddph36155.fpoly.lesson1

fun main(){
    var manageCBGV = ManageCBGV()

    var cbgv1 = CBGV("Hong Duy", "1", 30, "Ha Noi")
    var cbgv2 = CBGV("Thai Son", "2", 35, "Ha Noi")
    var cbgv3 = CBGV("Huu Huy", "3", 32, "Nam Dinh")
    manageCBGV.addCBGV(cbgv1)
    manageCBGV.addCBGV(cbgv2)
    manageCBGV.addCBGV(cbgv3)

    println("List CBGV")
    manageCBGV.watchListCBGV()


    manageCBGV.removeCBGV()
    println("List CBGV after remove")
    manageCBGV.watchListCBGV()
}

class CBGV (
    var name: String,
    var id: String,
    var age: Int?,
    var hometown: String
    )

class ManageCBGV{
    var listCBGV = mutableListOf<CBGV>()

    fun watchListCBGV (){
        listCBGV.forEachIndexed { index, CBGV ->
            println("Name is ${CBGV.name}")
            println("ID is ${CBGV.id}")
            println("Age is ${CBGV.age}")
            println("Hometown is ${CBGV.hometown}")
            println("-------------------------------")
        }
    }

    fun addCBGV(cbgv: CBGV){
        listCBGV.add(cbgv)
    }

    fun removeCBGV() {
        println("Nhap thu tu giao vien muon xoa: ")
        val s = readLine()
        val thuTu = s?.toIntOrNull()

        if (thuTu != null && thuTu in 1..listCBGV.size) {
            listCBGV.removeAt(thuTu - 1)
        } else {
            println("Thu tu khong hop le")
        }
    }

}