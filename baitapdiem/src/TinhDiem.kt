fun main() {
    print("Nhập điểm Math: ")
    val math = readln().toDouble()

    print("Nhập điểm Programming: ")
    val programming = readln().toDouble()

    print("Nhập điểm Database: ")
    val database = readln().toDouble()

    val tongDiem = math + programming + database
    val diemTrungBinh = tongDiem / 3
    val diemCaoNhat = maxOf(math, programming, database)
    val ketQua = if (diemTrungBinh >= 5.0) "Đạt" else "Không đạt"

    println("Sinh viên: Phan Ngọc Vinh")
    println("MSSV: 2415053122249")

    println("Tổng điểm: $tongDiem")
    println("Điểm trung bình: %.2f".format(diemTrungBinh))
    println("Điểm cao nhất: $diemCaoNhat")
    println("Kết quả: $ketQua")
}