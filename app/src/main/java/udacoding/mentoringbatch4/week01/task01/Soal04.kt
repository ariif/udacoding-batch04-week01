package udacoding.mentoringbatch4.week01.task01

class Soal04 {

    fun main() {

        nilaiUjian(75)

    }

    fun nilaiUjian(ujian: Int) {

        when (ujian) {
            in 60..79 -> println("memuaskan")
            in 81..89 -> println("sangat memuaskan")
            in 91..100 -> println("dengan pujian")
            in 0..59 -> println("tidak lulus")
        }

    }
}
