package anhddph36155.fpoly.lesson1

fun main(){
    var manageStudent = ManageStudent()

    var student1 = Student("Duy Anh", "1", 21, 7.5f, false)
    var student2 = Student("Thuy Trang", "2", 20, 7.9f, true)
    var student3 = Student("Cong Quang", "3", 19, 7.5f, false)
    manageStudent.addStudent(student1)
    manageStudent.addStudent(student2)
    manageStudent.addStudent(student3)

    println("List student")
    manageStudent.watchListStudent()

    manageStudent.removeStudent()

    println("List student after remove")
    manageStudent.watchListStudent()

}

class Student (
    var name: String,
    var id: String,
    var age: Int?,
    var point: Float,
    var graduate: Boolean?
)

class ManageStudent{
    var listStudent = mutableListOf<Student>()

    fun watchListStudent (){
        listStudent.forEachIndexed { index, student ->
            println("Name is ${student.name}")
            println("ID is ${student.id}")
            println("Age is ${student.age}")
            println("Point is ${student.point}")
            println("Graduate is ${student.graduate}")
            println("-------------------------------")
        }
    }

    fun addStudent(student: Student){
        listStudent.add(student)
    }

    fun removeStudent() {
        println("Nhap thu tu sinh vien muon xoa: ")
        val s = readLine()
        val thuTu = s?.toIntOrNull()

        if (thuTu != null && thuTu in 1..listStudent.size) {
            listStudent.removeAt(thuTu - 1)
        } else {
            println("Thu tu khong hop le")
        }
    }

}