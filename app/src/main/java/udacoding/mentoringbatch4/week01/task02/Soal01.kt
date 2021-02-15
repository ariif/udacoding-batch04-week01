package udacoding.mentoringbatch4.week01.task02

class Soal01 {

    fun main() {
        val number1 = 21.1
        val number2 = 41.0
        val result: String

        result = angkaDouble(number1, number2)
        println("result = $result")
    }


    fun angkaDouble(angka1: Double, angka2: Double): String {
        val jadiString = angka1.toString() + angka2.toString()
        return jadiString
    }
}