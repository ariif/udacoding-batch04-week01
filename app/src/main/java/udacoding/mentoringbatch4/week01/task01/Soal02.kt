package udacoding.mentoringbatch4.week01.task01

class Soal02 {
    fun main() {
        deret()
    }

    fun deret() {

        val deretBilangan = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (bilangan in deretBilangan) {
            if (bilangan % 2 == 0) println(bilangan)
        }
    }
}