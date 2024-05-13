package anhddph36155.fpoly.lesson1

fun main(){
    var quanLyThuVien = QuanLyThuVien()

    var sinhVien1 = SinhVienn("Duy Anh", 18, 12)
    var sinhVien2 = SinhVienn("Thuy Trang", 20, 10)

    quanLyThuVien.themSinhVien(sinhVien1)
    quanLyThuVien.themSinhVien(sinhVien2)

    quanLyThuVien.xemdsSinhVien()

    var theMuon1 = TheMuon(1, 20, 30, "5A")
    var theMuon2 = TheMuon(2, 10, 28, "6A")
    var theMuon3 = TheMuon(3, 6, 17, "7A")

    quanLyThuVien.themTheMuon(theMuon1)
    quanLyThuVien.themTheMuon(theMuon2)
    quanLyThuVien.themTheMuon(theMuon3)

    println("Danh sach the muon")
    quanLyThuVien.xemdsTheMuon()

    quanLyThuVien.xoaTheMuon()
    println("Danh sach the muon sau khi xoa")
    quanLyThuVien.xemdsTheMuon()

}

class QuanLyThuVien{
    var dsSinhVien = mutableListOf<SinhVienn>()
    var dsTheMuon = mutableListOf<TheMuon>()

    fun xemdsSinhVien(){
        dsSinhVien.forEachIndexed { index, sinhVienn ->
            println("Ho ten la ${sinhVienn.hoTen}")
            println("Tuoi la ${sinhVienn.tuoi}")
            println("Lop la ${sinhVienn.lop}")
            println("-----------------------------------")
        }
    }

    fun themSinhVien(sinhVienn: SinhVienn){
        dsSinhVien.add(sinhVienn)
    }

    fun xemdsTheMuon(){
        dsTheMuon.forEachIndexed { index, theMuon ->
            println("Ma phieu la ${theMuon.maPhieu}")
            println("Ngay muon la ${theMuon.ngayMuon}")
            println("Han tra la ${theMuon.hanTra}")
            println("So hieu la ${theMuon.soHieu}")
            println("----------------------------------")
        }
    }

    fun themTheMuon(theMuon: TheMuon){
        dsTheMuon.add(theMuon)
    }

    fun xoaTheMuon(){
        println("Nhap thu tu the muon muon xoa: ")
        val s = readLine()
        val thuTu = s?.toIntOrNull()

        if (thuTu != null && thuTu in 1..dsTheMuon.size) {
            dsTheMuon.removeAt(thuTu - 1)
        } else {
            println("Thu tu khong hop le")
        }
    }


}

class TheMuon (
    var maPhieu: Int,
    var ngayMuon: Int,
    var hanTra: Int,
    var soHieu: String
)

class SinhVienn(
    var hoTen: String,
    var tuoi: Int,
    var lop: Int
)