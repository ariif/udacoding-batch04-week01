package udacoding.mentoringbatch4.week01.task01

class Soal01 {

    fun main() {
        val number1 = 21
        val number2 = 41
        val result: String

        result = angkaInteger(number1, number2)
        println("result = $result")
    }


    fun angkaInteger(angka1: Int, angka2: Int): String {
        val jadiString = angka1.toString() + angka2.toString()
        return jadiString
    }
}