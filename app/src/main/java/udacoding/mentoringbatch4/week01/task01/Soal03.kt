package udacoding.mentoringbatch4.week01.task01

class Soal03 {
    fun main() {

        val result: Int
        val number1 = 3
        val number2 = 6.0
        val number3 = "9"
        result = jadiInteger(number1, number2, number3)
        println(result)
    }

    fun jadiInteger(angka1: Int, angka2: Double, angka3: String): Int {

        var konversiAngka1 = angka1.toInt()
        var konversiAngka2 = angka2.toInt()
        var konversiAngka3 = angka3.toInt()

        val result = konversiAngka1 + konversiAngka2 + konversiAngka3

        return result
    }
}