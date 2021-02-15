package udacoding.mentoringbatch4.week01.task02

class Soal02 {

    fun main() {
        deret()
    }

    fun deret() {

        val deretBilangan = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (bilangan in deretBilangan) {
            if (bilangan % 2 == 1) println(bilangan)
        }
    }
}
