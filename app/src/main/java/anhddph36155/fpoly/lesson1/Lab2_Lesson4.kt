package anhddph36155.fpoly.lesson1


    data class SinhVien(
        var tenSV: String,
        var mssv: String,
        var diemTB: Float,
        var daTotNghiep: Boolean?,
        var tuoi: Int?
    )

    class QuanLySinhVien {
        private val danhSachSinhVien = mutableListOf<SinhVien>()

        fun themSinhVien(sinhVien: SinhVien) {
            danhSachSinhVien.add(sinhVien)
        }

        fun xoaSinhVien(mssv: String) {
            val sinhVien = danhSachSinhVien.find { it.mssv == mssv }
            sinhVien?.let { danhSachSinhVien.remove(it) }
        }

        fun suaSinhVien(mssv: String, sinhVienMoi: SinhVien) {
            val index = danhSachSinhVien.indexOfFirst { it.mssv == mssv }
            if (index != -1) {
                danhSachSinhVien[index] = sinhVienMoi
            } else {
                println("Không tìm thấy sinh viên có MSSV là $mssv")
            }
        }

        fun xemDanhSachSinhVien() {
            danhSachSinhVien.forEachIndexed { index, sinhVien ->
                println("Sinh viên ${index + 1}:")
                println("Tên: ${sinhVien.tenSV}")
                println("MSSV: ${sinhVien.mssv}")
                println("Điểm trung bình: ${sinhVien.diemTB}")
                println("Đã tốt nghiệp: ${sinhVien.daTotNghiep ?: "Chưa có thông tin"}")
                println("Tuổi: ${sinhVien.tuoi ?: "Chưa có thông tin"}")
                println()
            }
        }
    }

    fun main() {
        val quanLySV = QuanLySinhVien()

        // Thêm sinh viên
        val sinhVien1 = SinhVien("Nguyen Van A", "123456", 8.5f, true, 22)
        val sinhVien2 = SinhVien("Tran Thi B", "654321", 7.9f, false, null)
        quanLySV.themSinhVien(sinhVien1)
        quanLySV.themSinhVien(sinhVien2)

        // Xem danh sách sinh viên
        println("Danh sách sinh viên sau khi thêm:")
        quanLySV.xemDanhSachSinhVien()

        // Xóa sinh viên
        quanLySV.xoaSinhVien("123456")
        println("Danh sách sinh viên sau khi xóa:")
        quanLySV.xemDanhSachSinhVien()

        // Sửa thông tin sinh viên
        val sinhVienMoi = SinhVien("Nguyen Van C", "123456", 9.0f, true, 23)
        quanLySV.suaSinhVien("123456", sinhVienMoi)
        println("Danh sách sinh viên sau khi sửa:")
        quanLySV.xemDanhSachSinhVien()
    }

